package biz.shengweiexam;

import core.util.HTMLUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/12/13.
 */
public class minaReview {

    public static String logDirPath = "D:\\111222";

    public static void main(String[] args) {

        File basePath = new File(logDirPath);
        String[] dirList = basePath.list();
        HashMap<String,Integer> hs = new HashMap();
        for (String s : dirList) {
            File nowDirPdf = new File(logDirPath+File.separator+s);
            readFileByLines(nowDirPdf,hs);
        }

        int i=0;
        for (String h : hs.keySet()) {
            System.out.println(h.toString()+","+hs.get(h));
            i++;
        }


    }

    public static void readFileByLines(File f,HashMap<String,Integer>  hs) {
        File file = f;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;

            int delay = 0 ;

            while ((tempString = reader.readLine()) != null) {
                //把当前行号显示出来

                String betweenString = HTMLUtil.getBetweenString(tempString, ":8588  ::ffff:", ":");

               // System.out.println(betweenString);
                //hs.add(tempString);
                hs.put(betweenString,hs.get(betweenString)==null?1:hs.get(betweenString)+1);
                line++;

                //anaAllCost(tempString);

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
    }
}
