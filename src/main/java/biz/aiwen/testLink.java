package biz.aiwen;

import core.util.HTMLUtil;
import core.util.HttpclientUtil;
import org.apache.commons.io.FileUtils;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/9/19.
 */
public class testLink {


    final static String ENURL= "http://xiaozhi.189.cn:8082/APPOnlineCustomer/";

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

        logFile = new File(new Date().getTime()+".txt");
        if(!logFile.exists()) logFile.createNewFile();

        String citys = "南京、苏州、镇江、盐城、连云港、淮安、宿迁、徐州、扬州、泰州、常州、无锡、南通";

        Object[] cityNames = citys.split("、");


        File file = new File("城市.txt");
        if(!file.exists()) file.createNewFile();

        List<String> cityList = FileUtils.readLines(file);

        if(cityList!=null&&cityList.size()>0)
        {
            cityNames = cityList.toArray();
        }



        file = new File("问题.txt");
        if(!file.exists()) file.createNewFile();

        List<String> keywordList = FileUtils.readLines(file);
        StringBuilder sb = new StringBuilder();
        System.out.println("关键词如下：");

        for (String ss : keywordList) {
            System.out.println(ss);
        }

        //String[] msgList = (String[])keywordList.toArray();


        while(true) {


            int i = ranNum(0, cityNames.length+2);

            if(i<1||i>cityNames.length) continue;



            String city = (cityNames[i-1]+"").trim();


            System.out.println(city);

           // continue;

            try {
                cityMsg(keywordList, city);
            } catch (Exception e) {
                e.printStackTrace();
            }


        }






    }
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss.SSS");
    public static void cityMsg(List<String> msgList, String city) throws Exception {
        DefaultHttpClient defaultHttpClient = HttpclientUtil.getDefaultHttpClient("UTF-8");


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
                ",\"ipCity\":\"" +city+
                "\"}");

        s = HttpclientUtil.post(pvCountUrl,params,null,defaultHttpClient);


        writeInfo(s+" - pvCount");

        Thread.sleep(200);


        for (String msg : msgList) {
            writeInfo("问题："+msg);
            params.clear();
            String info = java.net.URLEncoder.encode(msg, "UTF-8");




            params.put("m_param", "{\"inputInfo\":\"" +msg+
                    "\",\"currentID\":\"\",\"userId\":\"\",\"select_province\":\"\",\"select_city\":\"\",\"ipProvince\":\"江苏\"," +
                    "\"ipCity\":\"" +city+
                    "\",\"async\":\"0\",\"isIos\":false,\"time\":\"" +sdf.format(new Date())+

                    "Z\",\"applyCode\":\"pcuser\",\"mobile\":\"\",\"channel\":\"Html5\",\"province\":\"\",\"city\":\"\"}");








            s = HttpclientUtil.post(handleFinanceUrl, params, null, defaultHttpClient);


            if(s!=null&&s.contains("您的访问太过频繁，请稍后再试"))
            {
                Thread.sleep(200000);
                writeInfo("休息200s后切换城市");

//                尝试切换HttpClient
//                defaultHttpClient = HttpclientUtil.getDefaultHttpClient("UTF-8");
//                defaultHttpClient.getParams().setParameter("http.connection.timeout", Integer.valueOf(100000));
//                defaultHttpClient.getParams().setParameter("http.socket.timeout", Integer.valueOf(100000));

                break;

            }


            writeInfo("回答："+s);


        }
    }
}
