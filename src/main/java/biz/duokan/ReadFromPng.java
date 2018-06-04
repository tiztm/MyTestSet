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

    private static String  fileName = "D://0003.png";

    public static String fileDirPath = "D:\\test\\我的应许之地：以色列的荣耀与悲情";

    public static void main(String[] args) throws Exception {

//        File basePath = new File(fileDirPath);
//        String[] dirList = basePath.list();
//
//        for (String s : dirList) {
//            File nowDirPdf = new File(fileDirPath+File.separator+s);
//            String out = readFromImg(nowDirPdf);
//            System.out.println(out);
//        }
        File nowDirPdf = new File( fileName);
        String out = readFromImg(nowDirPdf);
        System.out.println(out);




    }

    static Tesseract instance =  new Tesseract();

    static File tessDataFolder = new File("D:\\tessdata");

    static
    {
        instance.setDatapath(tessDataFolder.getAbsolutePath());
        instance.setLanguage("chi_sim");
    }

    /**
     * 识别文字
     * @param read
     * @return
     * @throws TesseractException
     */
    private static String readFromImg(File read) throws TesseractException {



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
