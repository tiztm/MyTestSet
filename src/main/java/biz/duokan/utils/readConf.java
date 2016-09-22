package biz.duokan.utils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/8/23.
 * 读取conf
 */
public class readConf {

    private static String  confName = "this.conf";

    public static void main(String[] args) {

        readFileByLines();

    }


    public static Map<String,String> readFileByLines() {
        HashMap<String,String> waitMap = new HashMap<>();

        File file = new File(confName);
        BufferedReader reader = null;
        try {

            InputStreamReader isr=new InputStreamReader(new FileInputStream(file),"UTF-8");

            reader = new BufferedReader(isr);
            String tempString = null;
            int line = 1;
            while ((tempString = reader.readLine()) != null) {
                //把当前行号显示出来
                System.out.println("line " + line + ": " + tempString);

                String[] split = tempString.split("-");
                if(split.length==2)
                {
                    waitMap.put(split[0], split[1]);
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
