package biz.duokan.utils;

import javax.imageio.ImageIO;
import java.awt.*;
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
public class ChangeBackToWhite {

    private static String  fileName = "D://1795.png";

    public static void main(String[] args) throws IOException {


        BufferedImage read = ImageIO.read(new FileInputStream(fileName));

        BufferedImage waitFlush = toWhite(read);

        ImageIO.write(waitFlush, "png", new File("D://"+new Date().getTime()+".png"));
    }

    /**
     * 去除传入图片上方的标记
     * @param read
     * @return
     */
    public static BufferedImage toWhite(BufferedImage read) {


        if(read.getWidth()!=864||read.getHeight()!=1154)  return read;



        int rgbTest = read.getRGB(20, 40);
        //System.out.println(rgb);
        if(rgbTest!=-263432) return read;



        for(int y = 0;y<1154;y++){
        for(int x = 0;x<864;x++){
            int rgb2 = read.getRGB(x,y);

            if(rgb2 == -263432)
            {
                read.setRGB(x,y,0x00ffffff);
            }
            else
            {
//
//
//                final int r = (rgb2 >> 16) & 0xff;
//                final int g = (rgb2 >> 8) & 0xff;
//                final int b = rgb2 & 0xff;
//                int gray = (int) (0.3 * r + 0.59 * g + 0.11 * b);
//                int newPixel = colorToRGB(255, gray, gray, gray);
//                read.setRGB(x, y, newPixel);
            }


            }
        }


        return read;
    }


    public static int getGray(Color pixel) {
        return (pixel.getRed()*30+pixel.getGreen()*60+pixel.getBlue()*10)/100;
    }


    private static int colorToRGB(int alpha, int red, int green, int blue) {

        int newPixel = 0;
        newPixel += alpha;
        newPixel = newPixel << 8;
        newPixel += red;
        newPixel = newPixel << 8;
        newPixel += green;
        newPixel = newPixel << 8;
        newPixel += blue;

        return newPixel;

    }






}
