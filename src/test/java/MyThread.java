package biz.nilstest;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/12/16.
 */
public class MyThread extends Thread {

    int i=0;
    public static String s = "";

    public MyThread(int i) {
        this.i = i;
    }

    public void run() {
       s = s+i;
    }
}