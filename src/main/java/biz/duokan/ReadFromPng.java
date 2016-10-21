package biz.duokan;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/10/9.
 */
public class ReadFromPng {

    private static String  fileName = "D://0002.png";

    public static void main(String[] args) throws Exception {
        File imageFile = new File(fileName);
        String s = readFromImg(imageFile);
        System.out.println(s);
    }


    /**
     * 分辨率过低无法识别
     * @param read
     * @return
     * @throws TesseractException
     */
    private static String readFromImg(File read) throws TesseractException {

        Tesseract instance =  new Tesseract();

        File tessDataFolder = new File("D:\\tessdata");
        instance.setDatapath(tessDataFolder.getAbsolutePath());
        instance.setLanguage("chi_sim");

        ///instance.set
        String result = "";
        try {
            result = instance.doOCR(read);

        } catch (Exception e) {
            e.printStackTrace();
        }


        return result;



    }


    /**
     * 数字验证码识别，需要进行图像在处理，灰度，锐度的改变
     * @param read
     * @return
     * @throws TesseractException
     */
    private static String readNumFromImg(File read) throws TesseractException {

        Tesseract instance =  new Tesseract();

        File tessDataFolder = new File("D:\\tessdata");
        instance.setDatapath(tessDataFolder.getAbsolutePath());
        instance.setLanguage("chi_sim");

        instance.setTessVariable("tessedit_char_whitelist", "0123456789");

        ///instance.set
        String result = "";
        try {
            result = instance.doOCR(read);

        } catch (Exception e) {
            e.printStackTrace();
        }


        return result;



    }
}
