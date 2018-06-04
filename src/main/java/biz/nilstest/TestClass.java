package biz.nilstest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/12/5.
 */
public class TestClass {

    private int m;

    public int inc(){
        return m+1;
    }


    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        try {
            System.out.println((sdf.parse("2016-12-25")).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
