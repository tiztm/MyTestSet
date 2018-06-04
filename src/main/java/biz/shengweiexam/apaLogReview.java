package biz.shengweiexam;

import core.util.HTMLUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/12/13.
 */
public class apaLogReview {

    public static String logDirPath = "D:\\ApaLog";

    public static void main(String[] args) throws ParseException {

        File basePath = new File(logDirPath);
        String[] dirList = basePath.list();

        List hst = new ArrayList();



        HashMap<String,String> hs = new HashMap();
        for (String s : dirList) {
            File nowDirPdf = new File(logDirPath+File.separator+s);
            readFileByLines(nowDirPdf,hs,hst);
        }

        int i=0;
        for (String h : hs.keySet()) {
            System.out.println(i+",\""+h.toString()+"\","+hs.get(h));
            i++;
        }

        i=0;
        for (Object h : hst) {
            System.out.println(i+","+h.toString());
            i++;
        }




    }

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss", Locale.ENGLISH);

    private static Long pre = 2489056190000l;



    public static void readFileByLines(File f,HashMap<String,String>  hs, List  hst ) throws ParseException {
        File file = f;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;

            int delay = 0 ;

            while ((tempString = reader.readLine()) != null) {
                //把当前行号显示出来


                String betweenString = HTMLUtil.getBetweenString(tempString, "- -", " \"");

                String timeStr = betweenString.substring(2,betweenString.length()-7);


                Date parse = sdf.parse(timeStr);


                //System.out.println(parse.getTime());

                    if(parse.getTime()-pre<-19000) {
                        hs.put(tempString, (parse.getTime()-pre)+"");
                    }

                pre = parse.getTime();
                /**
                String betweenString = HTMLUtil.getBetweenString(tempString, "\"POST ", "\"");

                int i = tempString.lastIndexOf(' ');
                String substring = tempString.substring(i - 3, i);


                if(substring.endsWith("502"))
                {
                    hst.add(tempString);
                }

                //System.out.println(substring);

                hs.put(substring,hs.get(substring)==null?1:hs.get(substring)+1);

                 */
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
