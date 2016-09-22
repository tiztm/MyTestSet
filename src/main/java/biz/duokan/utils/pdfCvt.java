package biz.duokan.utils;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;


import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;


import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;

import javax.imageio.ImageIO;


/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/8/17.
 * pdf转化
 */
public class pdfCvt {


    /**
     * !!!最重要!!!
     * 扫描的书籍ID
     */
    //final static String BOOK_ID = "ad732c840fd441638c443ac48a51e573";

    private static String filePath =  "D:\\test\\" ;

    static int x = 0;

    static int y = 0;


    public static File Pdf(ArrayList<String> imageUrllist, String mOutputPdfFileName) {
        String TAG = "PdfManager";
        Document doc = new Document(new Rectangle((float)x, (float)y),0,0,0,0);
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(mOutputPdfFileName));
            doc.open();
            for (int i = 0; i < imageUrllist.size(); i++) {
                doc.newPage();
                Image png1 = Image.getInstance(imageUrllist.get(i));
                doc.add(png1);
            }
            doc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File mOutputPdfFile = new File(mOutputPdfFileName);
        if (!mOutputPdfFile.exists()) {
            mOutputPdfFile.deleteOnExit();
            return null;
        }
        return mOutputPdfFile;
    }


    public static void main(String[] args) throws Exception {

        // TODO Auto-generated method stub
        ArrayList<String> imageUrllist =null;

        File basePath = new File(filePath);
        String[] dirList = basePath.list();
        for (String s : dirList) {
            File nowDir = new File(filePath+File.separator+s);

            imageUrllist = new ArrayList<String>();


            if(nowDir.isDirectory())
            {
                File nowDirPdf = new File(filePath+s+".pdf");
                if(nowDirPdf.exists())
                {
                    System.out.println(s+"已有pdf");
                    continue;
                }

                String BOOK_ID = s;
                String path =filePath+BOOK_ID+"\\";

                File fPath = new File(path);

                String[] list = fPath.list();


                for (int i = 0; i <list.length ; i++) {
                    if(i==0)
                    {
                        BufferedImage read = ImageIO.read(new FileInputStream(path + list[i]));
                        x = read.getWidth();
                        y = read.getHeight();
                    }
                    imageUrllist.add(path + list[i]);
                }


                String pdfUrl = filePath +BOOK_ID+".pdf";
                File file = Pdf(imageUrllist, pdfUrl);
                try {
                    file.createNewFile();
                    System.out.println("为"+s+"生成pdf");
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }




            }
        }



    }

}
