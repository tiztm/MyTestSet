package biz.svn;

import java.io.*;
import java.util.UUID;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/9/13.
 */
public class svninfo {

    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(svninfo.class);

    public static void main(String[] args) {

//        String testStr = "交接资料(xiamx)/交接资料/东海玻璃/DHBL_1.3.2.apk";
//
//        resolveStr(testStr);




        String filePath = "F:\\SVNINFO";
        File basePath = new File(filePath);
        String[] dirList = basePath.list();
        for (String s : dirList) {
            if(!s.endsWith(".txt")||!s.startsWith("SVN")) continue;

            //System.out.println(s);


            File nowFile = new File(filePath+File.separator+s);

            readFileByLines(nowFile);


            //break;


            }

    }



    public static void readFileByLines(File f) {
        File file = f;
        String fname = f.getName();


        fname = fname.substring(4,fname.length()-4);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader( new InputStreamReader(new FileInputStream(file),"GB2312"));
            String tempString = null;
            int line = 1;
            while ((tempString = reader.readLine()) != null) {


                resolveStr(tempString,fname);

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

    public static void resolveStr(String tempString,String rep) {
        //logger.info(tempString);


        //rowid,1,2,3,4
        //System.out.println(tempString);

        int i = tempString.lastIndexOf('.');
        int j = tempString.lastIndexOf('/');

        if(i<1||tempString.length()-i<4||j>i) return;

        String hz = tempString.substring(i,tempString.length()).replaceAll(",","，");

        String path = tempString.substring(0,j+1).replaceAll(",","，");

        String name = tempString.substring(j+1,i).replaceAll(",","，");

        String x = UUID.randomUUID().toString().replaceAll("-","") + "," + name + "," + hz + "," + rep + "," + path;
        //System.out.println(x);

        logger.info(x);



    }


}
