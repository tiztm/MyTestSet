package duokan;

import com.rui.utils.HTMLUtil;
import com.rui.utils.HttpclientUtil;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.List;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/8/22.
 */
public class duokanBookOut {

    private static  final  String book_start_url="http://www.duokan.com/list/6-";

    private  static  final int fiPage = 119;


    static File logFile;

//    public static void writeInfo(String s) throws Exception
//    {
//        writer.write(s+"\r\n");
//    }
//

    public static void main(String[] args) throws Exception {


        logFile = new File(new Date().getTime()+".txt");
        if(!logFile.exists()) logFile.createNewFile();

        FileWriter writer = new FileWriter(logFile, true);


        for (int i = 1; i <=fiPage ; i++) {
            String url = book_start_url+i;
            System.out.println(url);


            String s = null;
            try {
                s = HttpclientUtil.get(url);
            } catch (Exception e) {
                e.printStackTrace();
                i--;
                Thread.sleep(5000l);
                continue;
            }


            s=s.replaceAll("\n", "").replaceAll("\r", "");

            //
            //
            List<String> patternString = HTMLUtil.getPatternString(s, "class=\"u-bookitm1 j-bookitm.*?class=\"u-stargrade\"");

            for (String s1 : patternString) {

                // b8f420c88fdd4773a566df19467edc3b
                //算法的乐趣
                String id = HTMLUtil.getBetweenString(s1, "data-id=\"", "\"><div");
                String name = HTMLUtil.getBetweenString(s1, "class=\"title\" hidefocus=\"hidefocus\" target=\"_blank\">", "</a><div class=\"u-stargrade\"");
                System.out.println(id+"-"+name);
                writer.write(id+"-"+name+"\r\n");
            }



        }

        writer.close();
    }
}
