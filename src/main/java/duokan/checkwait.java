package duokan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Administrator on 2016/8/18 0018.
 */
public class checkwait {


    private static String basePath = "E:\\test\\";


    private static String waitConfText = basePath+"waitlist.txt";

    public static void main(String[] args) {

        readFileByLines(waitConfText);

    }



    public static void readFileByLines(String f) {
        File file = new File(f);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            while ((tempString = reader.readLine()) != null) {
                //把当前行号显示出来
                System.out.print("line " + line + ": " + tempString);

                String[] split = tempString.split("-");
                if(split.length==2)
                {
                    File pdfFile = new File(basePath+split[1]+".pdf");
                    if(pdfFile.exists())
                        System.out.println("-yes");
                    else

                        System.out.println("-no");
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
    }
}
