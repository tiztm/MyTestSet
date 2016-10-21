package biz.duokan;
import java.io.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

/**
 *@author:HaxtraZ
 *@date:2014年9月25日 22:44:01
 *@descripion:模拟键盘事件
 *    通过调用jdk的Robot类的keyPress和keyRelease方法实现
 **/
public class J_Keydown
{
    public static void main(String[] args)
            throws AWTException
    {
        Robot r=new Robot();//创建自动化工具对象

        for (int i = 0; i <4 ; i++) {

            r.keyPress(KeyEvent.VK_CONTROL);//按下左Contrl  keycode为17

            r.keyPress(KeyEvent.VK_ADD);

            r.keyRelease(KeyEvent.VK_ADD);

            r.keyRelease(KeyEvent.VK_CONTROL);//释放左Control键

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
}