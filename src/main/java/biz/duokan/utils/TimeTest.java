package biz.duokan.utils;



import sun.jvmstat.monitor.*;

import java.io.IOException;
import java.util.Calendar;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/2/27.
 */
public class TimeTest {
    public static void main(String[] args) throws IOException {
        Calendar now = Calendar.getInstance();

        int i = now.get(Calendar.HOUR_OF_DAY);

        System.out.println(i);

        Runtime.getRuntime().exec("Shutdown -s");
    }
}
