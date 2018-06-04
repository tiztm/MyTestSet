package biz.aiwen;

import core.util.DateSpanUtil;
import core.util.HTMLUtil;
import core.util.HttpclientUtil;
import org.apache.commons.io.FileUtils;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/9/19.
 */
public class testLink1 {


    final static String ENURL= "http://180.153.69.0:8082/APPOnlineCustomer/";

    final static String mainUrl =   ENURL+"servlet/pmain";

    final static String sessionUrl =   ENURL+"handle/getSessionAction.action";

    final static String pvCountUrl =   ENURL+"handle/pvCount.action";

    final static String handleFinanceUrl =   ENURL + "handle/handleFinanceAction.action";

    static File logFile;

    public static void writeInfo(String s) throws Exception
    {
        FileWriter writer = new FileWriter(logFile, true);
        writer.write(s+"\r\n");
        System.out.println(s);
        writer.close();
    }


    final static Random random = new Random();
    private static int ranNum(int min,int max)
    {


        int s = random.nextInt(max)%(max-min+1) + min;
        return s;
    }

    public static void main(String[] args) throws Exception {

        final DefaultHttpClient defaultHttpClient = HttpclientUtil.getDefaultHttpClient("UTF-8");

        defaultHttpClient.getParams().setParameter("http.connection.timeout", Integer.valueOf(100000));
        defaultHttpClient.getParams().setParameter("http.socket.timeout", Integer.valueOf(100000));

        DateSpanUtil ds = new DateSpanUtil();
        String s = HttpclientUtil.get("http://10.1.157.34/dashboard/favicon.ico",null,null,defaultHttpClient);

        System.out.println(s);

        ds.getSpanDate();


    }

    public static void cityMsg(List<String> msgList, String city) throws Exception {
        final DefaultHttpClient defaultHttpClient = HttpclientUtil.getDefaultHttpClient("UTF-8");


        defaultHttpClient.getParams().setParameter("http.connection.timeout", Integer.valueOf(100000));
        defaultHttpClient.getParams().setParameter("http.socket.timeout", Integer.valueOf(100000));


        Map<String, String> params = new HashMap<>();


        params.put("ReqParam","{%22province%22:%22%E6%B1%9F%E8%8B%8F%22,%22city%22:%22%E5%8D%97%E4%BA%AC%22}");


        String s = HttpclientUtil.get(mainUrl,params,null,defaultHttpClient);

        s=s.replaceAll("\n", "").replaceAll("\r", "");

        String welcStr = HTMLUtil.getBetweenString(s,"<div class=\"dialogue1\">","</div>");

        writeInfo(welcStr+" - "+city);


        Thread.sleep(200);
        s = HttpclientUtil.get(sessionUrl,null,null,defaultHttpClient);

        writeInfo(s+" - sessionCount");


        Thread.sleep(200);

        params.clear();
        params.put("m_param","{\"linkContext\":\"\",\"userId\":\"\",\"channel\":\"Html5\",\"category\":\"refresh\"" +
                ",\"province\":\"江苏\",\"city\":\"" +city+
                "\",\"applyCode\":\"pcuser\",\"mobile\":\"\",\"ipProvince\":\"江苏\"" +
                ",\"ipCity\":\"南京\"}");

        s = HttpclientUtil.post(pvCountUrl,params,null,defaultHttpClient);


        writeInfo(s+" - pvCount");

        Thread.sleep(200);


        for (String msg : msgList) {
            writeInfo("问题："+msg);
            params.clear();
            String info = java.net.URLEncoder.encode(msg, "UTF-8");

            params.put("m_param", "{\"inputInfo\":\"" + info + "\",\"currentID\":\"\",\"userId\":\"\",\"province\":\"江苏\"," +
                    "\"city\":\"" + city +
                    "\",\"ipProvince\":\"江苏\",\"ipCity\":\"南京\",\"async\":\"0\",\"isIos\":false," +
                    "\"time\":\"2017-02-08T07:04:35.803Z\",\"applyCode\":\"pcuser\",\"mobile\":\"\",\"channel\":\"Html5\"}");

            s = HttpclientUtil.post(handleFinanceUrl, params, null, defaultHttpClient);


            writeInfo("回答："+s);


        }
    }
}
