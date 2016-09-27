package biz.duokan.utils;

import biz.duokan.PrintDuokan;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/8/23.
 */
public class BlankPage {

    private static String  fileName = "D://0027.png";

    public static void main(String[] args) throws IOException {


        BufferedImage read = ImageIO.read(new FileInputStream(fileName));

        System.out.println(read.getHeight());


    }




}
