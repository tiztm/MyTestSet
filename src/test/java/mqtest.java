import core.util.HttpclientUtil;
import org.apache.http.impl.client.DefaultHttpClient;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/11/13.
 */
public class mqtest {

    public static void main(String[] args) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("1","2");
        params.put("5","4");

        DefaultHttpClient httpclient = HttpclientUtil.getDefaultHttpClient();
        httpclient.getParams().setParameter("http.connection.timeout", Integer.valueOf(6000));
        httpclient.getParams().setParameter("http.socket.timeout", Integer.valueOf(6000));
        String post = HttpclientUtil.post("http://127.0.0.1:8881/index/svnSearchList.action", params);

        System.out.println(post);


    }
}
