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
public class noBuy {

    private static String  fileName = "D://0061.png";

    private static String  priceFileName = "D://1474879539191 - 副本.png";

    public static void main(String[] args) throws IOException {


        BufferedImage read = ImageIO.read(new FileInputStream(fileName));

        BufferedImage priceFile = ImageIO.read(new FileInputStream(priceFileName));

        BufferedImage waitFlush = delBufferMark(read);


        PrintDuokan.compare("价格标签",waitFlush,priceFile);

        ImageIO.write(waitFlush, "png", new File("D://"+new Date().getTime()+".png"));
    }

    /**
     * 去除传入图片上方的标记
     * @param read
     * @return
     */
    public static BufferedImage delBufferMark(BufferedImage read) {


        BufferedImage temImg =  read.getSubimage(186*2,411*2,  60*2, 30*2);;


        return temImg;
    }


}
