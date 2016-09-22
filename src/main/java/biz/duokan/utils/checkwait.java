package biz.duokan.utils;

import biz.duokan.PrintDuokan;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/8/18 0018.
 */
public class checkwait {


    private static String basePath = PrintDuokan.filePath;


    private static String waitConfText = basePath+"bin/"+"waitlist.txt";

    public static void main(String[] args) {

        Map<String, String> stringStringMap = readFileByLines(waitConfText);
        System.out.println(stringStringMap.size());
    }

    public static Map<String,String> readFileByLines() {
        return readFileByLines(waitConfText);
    }

    public static Map<String,String> readFileByLines(String f) {
        HashMap<String,String> waitMap = new HashMap<>();

        File file = new File(f);
        BufferedReader reader = null;
        try {

            InputStreamReader isr=new InputStreamReader(new FileInputStream(file),"UTF-8");

            reader = new BufferedReader(isr);
            String tempString = null;
            int line = 1;
            while ((tempString = reader.readLine()) != null) {
                //把当前行号显示出来
                System.out.print("line " + line + ": " + tempString);

                String[] split = tempString.split("-");
                if(split.length==2)
                {
                    File pdfFile = new File(basePath+split[1]);
                    if(pdfFile.exists())
                        System.out.println("-yes");
                    else {

                        pdfFile = new File(basePath+split[1]+".pdf");
                        if(pdfFile.exists())
                            System.out.println("-yes");
                        else {
                            waitMap.put(split[0], split[1]);
                            System.out.println("-no");
                        }
                    }
                }

                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return waitMap;
    }
}
