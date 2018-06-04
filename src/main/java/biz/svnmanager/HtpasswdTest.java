package biz.svnmanager;

import core.util.HttpclientUtil;
import org.apache.http.client.HttpClient;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

import javax.net.ssl.SSLContext;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/1/22.
 */
public class HtpasswdTest {

    public static HttpClient client = null;
    static {
        RegistryBuilder<ConnectionSocketFactory> registryBuilder = RegistryBuilder.<ConnectionSocketFactory>create();
        ConnectionSocketFactory plainSF = new PlainConnectionSocketFactory();
        registryBuilder.register("http", plainSF);
//指定信任密钥存储对象和连接套接字工厂
        try {
            KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
            SSLContext sslContext = SSLContexts.custom().useTLS().loadTrustMaterial(trustStore, new AnyTrustStrategy()).build();
            LayeredConnectionSocketFactory sslSF = new SSLConnectionSocketFactory(sslContext, SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            registryBuilder.register("https", sslSF);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Registry<ConnectionSocketFactory> registry = registryBuilder.build();

        //设置连接管理器
        PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager(registry);
        //connManager.setDefaultConnectionConfig(connConfig);
        //connManager.setDefaultSocketConfig(socketConfig);
//构建客户端
        client = HttpClientBuilder.create().setConnectionManager(connManager).build();
    }

    public static void main(String[] args) throws Exception {


        SVNWorkers workers = new SVNWorkers();
        workers.readWorker();
        for (String svnworker : workers.svnworkers) {
            String name = svnworker;
            String pass = "123";
            changePasswd(name,pass);
            changePasswd(name,name);
            Thread.sleep(100);
        }


    }

    public static void changePasswd(String name,String pass) throws Exception {
        Map<String, String> paraMap = new HashMap<>();
        paraMap.put("name", name);
        paraMap.put("op",pass);

        paraMap.put("p1",name+"170122");
        paraMap.put("p2",name+"170122");
        paraMap.put("chgpasswd","修 改");


        String s = HttpclientUtil.post("https://202.102.101.40:2020/rui-cgi/passchange55.cgi",paraMap,null,client);
        //System.out.println(s);
        if(s.contains("旧密码错误"))
        {
            //System.out.println(name+" - OK");
        }
        else    if(s.contains("成功修改密码"))
        {
            System.out.println(name+"成功修改密码");
        }
        else
        {
            System.out.println(s);
        }
    }
}
