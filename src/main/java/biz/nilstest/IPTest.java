package biz.nilstest;

import biz.duokan.PrintDuokan;
import core.util.DateSpanUtil;
import core.util.HttpclientUtil;
import org.apache.commons.io.FileUtils;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/10/11.
 */
public class IPTest {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    //private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(IPTest.class);


    //,"http://172.16.200.3:8080/zjxq//captcha1.action"

     static String[] urls = {"http://172.16.200.3:8080/zjxq//captcha.action","http://ydms.zjna.gov.cn/captcha.action","http://172.16.200.3:8080/zjxq//captcha1.action"

    }
    ;

    public static void main(String[] args) throws InterruptedException, IOException {



        File file = new File("urls.txt");
        if(!file.exists()) file.createNewFile();

        java.util.List<String> keywordList = FileUtils.readLines(file);


int ii=1;
while (true)
{


    System.out.println(sdf.format(new Date())+"  检测循环： "+ii);
        ii++;
        for (String url : keywordList) {

            String ss = "";
            long time1 = new Date().getTime();
            try {
                ss = HttpclientUtil.get(url);
            } catch (Exception e) {
               // e.printStackTrace();
                System.out.println(sdf.format(new Date())+"  "+url+" - 访问失败!");
                getBeep();
                continue;
            }

            long time2 = new Date().getTime();

            long l = time2 - time1;
            System.out.println(sdf.format(new Date())+"  访问正常，耗时"+ l +"ms，返回大小："+ss.length()+" - "+url);
            if(ss.length()<850||ss.length()>1150||l>2000)
            {
                getBeep();
            }



        }

        Thread.sleep(10000);
}


    }


    private static void getBeep() throws MalformedURLException {

        System.out.println(sdf.format(new Date())+"  "+"！！发生告警！！");
        URL cb;
        File f = new File("5349.wav");
        cb = f.toURL();
        AudioClip aau;
        aau = Applet.newAudioClip(cb);
        aau.play();
    }
}
