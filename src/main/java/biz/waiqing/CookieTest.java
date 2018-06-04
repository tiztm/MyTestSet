package biz.waiqing;

import core.util.HttpclientUtil;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/3/30.
 */
public class CookieTest {

    public static void main(String[] args) throws Exception {

        int i = 0;

        HashMap<String,Integer> hm = new HashMap<>();


        while (i<2000) {

            DefaultHttpClient defaultHttpClient = HttpclientUtil.getDefaultHttpClient();
            String s = HttpclientUtil.get("http://www.hxwqzs.com/login.do", null, null, defaultHttpClient);
            CookieStore cookieStore = defaultHttpClient.getCookieStore();

            List<Cookie> cookies = cookieStore.getCookies();

            for (Cookie cookie : cookies) {
                String value = cookie.getValue();
                String substring = value.substring(value.indexOf("."));
                System.out.println(cookie.getName() + "-" + value);

                hm.put(substring,hm.get(substring)==null?1:hm.get(substring)+1);


            }

            i++;
        }

        Set<String> strings = hm.keySet();

        for (String string : strings) {
            System.out.println(string+"-"+hm.get(string));
        }


        //   System.out.println(s);
    }
}
