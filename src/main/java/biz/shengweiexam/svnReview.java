package biz.shengweiexam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/12/13.
 */
public class svnReview {

    public static String logDirPath = "C:\\Users\\nilszhang\\Desktop\\新建文件夹 (3)";

    public static void main(String[] args) {

        File basePath = new File(logDirPath);
        String[] dirList = basePath.list();
        HashSet  hs = new HashSet();

        for (String s : dirList) {
            File nowDirPdf = new File(logDirPath+File.separator+s);
            readFileByLines(nowDirPdf,hs);

            //- 117.92.13.82
            //- 218.94.40.202
            //s_id=331536
        }


        for (Object h : hs) {
            System.out.println(h.toString());
        }


    }

    public static void readFileByLines(File f,HashSet  hs) {
        File file = f;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;

            int delay = 0 ;

            while ((tempString = reader.readLine()) != null) {
                //把当前行号显示出来

                if(tempString.contains("/dav"))
                {
                    //System.out.println("line " + line + ": " + );
                    hs.add(tempString.substring(0,tempString.indexOf("/dav/")));


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
