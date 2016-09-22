package biz.aiwen;

import core.util.HTMLUtil;
import core.util.HttpclientUtil;
import org.apache.commons.io.FileUtils;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/7/20.
 */
public class myai {

    final static String beginUrl = "http://ask.zhidao.189.cn/queryQuestion.do?qstatus=1&searchKey=";

    final  static  String  areaUrl = "http://ask.zhidao.189.cn/exchangeProCode.do?_=1468979141384&PROCODE=JS&CITYCODE=8320100";

     static File logFile;

    public static void writeInfo(String s) throws Exception
    {
        FileWriter writer = new FileWriter(logFile, true);
        writer.write(s+"\r\n");
        writer.close();
    }

    public static void main(String[] args) throws Exception {


        logFile = new File(new Date().getTime()+".txt");
        if(!logFile.exists()) logFile.createNewFile();

        FileWriter writer = new FileWriter(logFile, true);




        File file = new File("关键词.txt");
        if(!file.exists()) file.createNewFile();

        List<String> keywordList = FileUtils.readLines(file);
        StringBuilder sb = new StringBuilder();
        System.out.println("关键词如下：");

        writer.write("关键词如下：\r\n");
        for (String ss : keywordList) {
            sb.append( ss + ",");
        }
        System.out.println(sb.toString());

        writer.write(sb.toString()+"\r\n");

        file = new File("次数.txt");
        if(!file.exists()) file.createNewFile();
        List<String> timeList = FileUtils.readLines(file);
        if(timeList==null||timeList.size()!=1){
            System.out.println("循环次数未设置");
            return;
        }

        int times = 0;


        try {
            times = Integer.parseInt(timeList.get(0));
        } catch (NumberFormatException e) {
            System.out.println("次数设置错误");
            return;

        }


        System.out.println("准备进行"+times+"次循环，是否需要？（输入y继续，其他退出）");
        Scanner reader=new Scanner(System.in);
        String name = reader.next();
        if(name==null) return;
        if(!name.equals("y")) return;

        // 创建一个httpclient实例
        DefaultHttpClient httpclient = HttpclientUtil
                .getDefaultHttpClient("UTF-8");

        try {

         HttpclientUtil.get("http://ask.zhidao.189.cn/", null, null, httpclient);

            String s = HttpclientUtil.get(areaUrl, null, null, httpclient);
            System.out.println(s);
            writer.write(s+"\r\n");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("获取首页出错，请重新启动");
            writer.write("获取首页出错，请重新启动"+"\r\n");
        }

        writer.close();
        //times = 1;
        for (int i = 1; i < times+1; i++) {

            StringBuffer log = new StringBuffer();

            System.out.println("循环:"+i);
            log.append("循环:"+i+"\r\n");

            for (String ss : keywordList) {

                System.out.println("关键词:"+ss);
                log.append("关键词:"+ss+"\r\n");
                String s = "";
                try {
                   s = HttpclientUtil.get(beginUrl + ss, null, null, httpclient);
                } catch (Exception e) {
                    e.printStackTrace();
                    continue;
                }


                s=s.replaceAll("\n", "").replaceAll("\r", "");

                String queList = HTMLUtil.getBetweenString(s,"style=\"border-bottom: 0px; border-right: 0px; border-left: 0px;\">","</ul>");

                List<String> patternString = HTMLUtil.getPatternString(queList, "href=\".*?\">");

                for (String urls:patternString
                     ) {
                    String urlToVisit = urls.substring(6, urls.length() - 2);

                    try {
                        HttpclientUtil.get(urlToVisit, null, null, httpclient);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.println(new Date()+" - Visited: "+urlToVisit);
                    log.append(new Date()+" - Visited: "+urlToVisit+"\r\n");
                }



                //

            }


            writeInfo(log.toString());
        }








    }
}
