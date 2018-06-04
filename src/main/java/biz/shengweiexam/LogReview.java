package biz.shengweiexam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/12/13.
 */
public class LogReview {

    public static String logDirPath = "F:\\ksxt";

    public static void main(String[] args) {

        File basePath = new File(logDirPath);
        String[] dirList = basePath.list();

        for (String s : dirList) {
            File nowDirPdf = new File(logDirPath+File.separator+s);
            readFileByLines(nowDirPdf,"s_id=297636");

            //- 117.92.13.82
            //- 218.94.40.202
            //s_id=331536
        }

    }

    public static void readFileByLines(File f,String beginStr) {
        File file = f;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;

            int delay = 0 ;

            while ((tempString = reader.readLine()) != null) {
                //把当前行号显示出来


                if(delay>0)
                {
                    System.out.println("line " + line + ": " + tempString);
                    delay--;
                    continue;
                }



                if(tempString.contains(beginStr)) {

                    System.out.println("line " + line + ": " + tempString);

                    if(tempString.contains("POST"))
                    {
                        delay = 25;
                    }

                }
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
