package biz.nilstest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/12/16.
 */
public class Mybug {


    public static  String out = "";

    public Mybug() {
        out = "";
    }


    public void getTen() throws InterruptedException {
        MyThread[] myThread1 = new MyThread[10];

        for (int i = 0; i < 10; i++) {
            myThread1[i] = new MyThread(i);
            myThread1[i].start();
            //myThread1[i].join();
        }
        Thread.sleep(100);
        for (int i = 0; i < 10; i++) {
            out =  myThread1[i].s;
        }

        System.out.println(out);
    }

}


