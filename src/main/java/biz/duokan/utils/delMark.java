package biz.duokan.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/8/23.
 */
public class delMark {

    private static String  fileName = "D://0005.png";

    public static void main(String[] args) throws IOException {


        BufferedImage read = ImageIO.read(new FileInputStream(fileName));

        BufferedImage waitFlush = delBufferMark(read);

        ImageIO.write(waitFlush, "png", new File("D://"+new Date().getTime()+".png"));
    }

    /**
     * 去除传入图片上方的标记
     * @param read
     * @return
     */
    public static BufferedImage delBufferMark(BufferedImage read) {


        if(read.getWidth()!=864||read.getHeight()!=1154)  return read;

        int rgb = read.getRGB(392 * 2 + 10, 42 * 2 - 10);

        int rgb2 = read.getRGB(20, 40);
        //System.out.println(rgb);
        if(rgb!=rgb2) return read;



        for(int y = 42*2;y<80*2;y++){
        for(int x = 392*2;x<421*2;x++){
                    read.setRGB(x,y,rgb);
            }
        }


        return read;
    }


}
