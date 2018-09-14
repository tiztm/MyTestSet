package biz.nilstest;

import core.util.HttpclientUtil;
import org.apache.commons.io.FileUtils;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/10/11.
 */
public class TQLoginTest {

    public static void main(String[] args) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("userName","wg1");
        params.put("password","a123456");


        String post = HttpclientUtil.post("http://10.168.1.37:8080/login.action", params);


        System.out.println(post);

    }


}
