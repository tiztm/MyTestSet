package biz.duokan.utils;

import com.sun.image.codec.jpeg.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/8/24.
 * JPG缩放
 */
public class NarrowImage {

    /**

     *            倍数,比如0.5就是缩小一半,0.98等等double类型
     * @return 返回处理后的图像
     */
    public BufferedImage zoomImage(String src) {

        BufferedImage result = null;

        try {
            File srcfile = new File(src);
            if (!srcfile.exists()) {
                System.out.println("文件不存在");

            }
            BufferedImage im = ImageIO.read(srcfile);

            /* 原始图像的宽度和高度 */
            int width = im.getWidth();
            int height = im.getHeight();

            //压缩计算
            float resizeTimes = 2f;  /*这个参数是要转化成的倍数,如果是1就是转化成1倍*/

            /* 调整后的图片的宽度和高度 */
            int toWidth = (int) (width * resizeTimes);
            int toHeight = (int) (height * resizeTimes);

            /* 新生成结果图片 */
            result = new BufferedImage(toWidth, toHeight,
                    BufferedImage.TYPE_INT_RGB);

            result.getGraphics().drawImage(
                    im.getScaledInstance(toWidth, toHeight,
                            java.awt.Image.SCALE_SMOOTH), 0, 0, null);


        } catch (Exception e) {
            System.out.println("创建缩略图发生异常" + e.getMessage());
        }

        return result;

    }

    public boolean writeHighQuality(BufferedImage im, String fileFullPath) {
        try {
                /*输出到文件流*/
            FileOutputStream newimage = new FileOutputStream(fileFullPath);
            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(newimage);
            JPEGEncodeParam jep = JPEGCodec.getDefaultJPEGEncodeParam(im);
                /* 压缩质量 */
            jep.setQuality(0.9f, true);
            encoder.encode(im, jep);
               /*近JPEG编码*/
            newimage.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static String filePath =  "D:\\test\\" ;

    public static void main(String[] args) {



        String path =filePath;

        File fPath = new File(path);

        String[] list = fPath.list();


        for (int i = 0; i <list.length ; i++) {

            if(list[i].endsWith(".png")) {


                String inputFoler = path + list[i];
         /*这儿填写你存放要缩小图片的文件夹全地址*/
                String outputFolder =path +list[i]+".jpg";
        /*这儿填写你转化后的图片存放的文件夹*/


                NarrowImage narrowImage = new NarrowImage();
                narrowImage.writeHighQuality(narrowImage.zoomImage(inputFoler), outputFolder);
            }

        }



    }

}