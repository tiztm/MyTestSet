package biz.gcore;

import core.util.HTMLUtil;
import core.util.HttpclientUtil;

import java.io.*;
import java.net.*;

import java.util.List;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/7/7.
 */
public class gradio {

    private static String FilePath = "E:\\机核网MP3\\";

    public static void main(String[] args) throws Exception {

        int allPage = 28;


        for (int i = 1; i < allPage ; i++) {

            String s = HttpclientUtil.get("http://www.g-cores.com/categories/9/originals?page=" + i);
            s=s.replaceAll("\n", "").replaceAll("\r", "").replaceAll(" ", "");
            List<String> patternString = HTMLUtil.getPatternString(s, "showcase-audio.*?showcase_info");


            for (String s1 : patternString) {
                boolean ok = false;
                while (!ok) {


                    try {
                        String s2 = splitUrl(s1);
                        if(s2.equals("re")) return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        Thread.sleep(10000);
                        continue;
                    }

                    ok = true;
                }

            }

        }


    }

    private static String splitUrl(String s2) throws Exception{

        String xilie = HTMLUtil.getBetweenString(s2,"href=\"https://www.g-cores.com/categories/","</a></span>");


        xilie = xilie.substring(4).toUpperCase();


        String url = HTMLUtil.getBetweenString(s2,"showcase_img\"><atarget=\"_self\"href=\"","\"><spanclass=\"");
        String name = HTMLUtil.getBetweenString(s2,"><imgalt=\"","\"src=\"http");


        String filePath = FilePath;

        String fileName = xilie+"-"+name+".mp3";


        File f = new File(filePath+fileName);

        if(f.exists()) {
            System.out.println("跳过重复！");
            return "re";
        }

        String s = HttpclientUtil.get(url);

        Thread.sleep(2000);
        //System.out.println(s);

        //mediaSrc: {"mp3":["http://alioss.g-cores.com/uploads/audio/e8d8a72b-22d6-4ce9-80b4-641576cc07b9.mp3"]}

        String mp3Url = HTMLUtil.getBetweenString(s,"\"mp3\":",".mp3");

        if(mp3Url == null || mp3Url.length()<1) {
            System.out.println(s);
            return "jump";
        }

        mp3Url = mp3Url.substring(2)+".mp3";

        System.out.println(xilie+"-"+name+":"+url+"----"+mp3Url);


        boolean flag = saveUrlAs(mp3Url, filePath + fileName);
        System.out.println("Run ok!/n<BR>Get URL file " + flag);

        return "OK";

    }

    public static boolean saveUrlAs(String photoUrl, String fileName) {
        //此方法只能用户HTTP协议
        try {
            URL url = new URL(photoUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            DataInputStream in = new DataInputStream(connection.getInputStream());
            DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName));
            byte[] buffer = new byte[4096];
            int count = 0;
            while ((count = in.read(buffer)) > 0) {
                out.write(buffer, 0, count);
            }
            out.close();
            in.close();
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public String getDocumentAt(String urlString) {
        //此方法兼容HTTP和FTP协议
        StringBuffer document = new StringBuffer();
        try {
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.
                    getInputStream()));
            String line = null;
            while ( (line = reader.readLine()) != null) {
                document.append(line + "/n");
            }
            reader.close();
        }
        catch (MalformedURLException e) {
            System.out.println("Unable to connect to URL: " + urlString);
        }
        catch (IOException e) {
            System.out.println("IOException when connecting to URL: " + urlString);
        }
        return document.toString();
    }

}
