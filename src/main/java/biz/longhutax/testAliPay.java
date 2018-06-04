package biz.longhutax;

import biz.svnmanager.HtpasswdTest;
import core.util.HttpclientUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/4/14.
 */
public class testAliPay {

    public static void main(String[] args) {
        Map<String, String> paraMap = new HashMap<>();
        paraMap.put("info%5Bname%5D", "%E9%BE%99%E8%99%8E%E7%BD%91%E5%8F%8B");
        paraMap.put("info%5Bphone%5D","15301586331");


        String s = null;
        try {
            s = HttpclientUtil.post("http://zt.longhoo.net/index.php?m=formguide&c=index&a=yk_info&formid=184&siteid=1",paraMap,null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(s);

    }
}
