package biz.duokan;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;


import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;


import biz.duokan.entity.PageEntity;
import biz.duokan.utils.ChangeBackToWhite;
import biz.duokan.utils.DuoKanService;
import biz.duokan.utils.readConf;
import biz.duokan.utils.splitCataHTML;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import db.entity.Duokan;

import javax.imageio.ImageIO;


/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/8/17.
 * pdf转化
 */
public class PdfComvert {




    static int x = 0;

    static int y = 0;


    public static File Pdf(ArrayList<String> imageUrllist, String mOutputPdfFileName, String fileName) {
        String TAG = "PdfManager";
        Document doc = new Document(new Rectangle((float)x, (float)y),0,0,0,0);
        try {
            PdfWriter instance = PdfWriter.getInstance(doc, new FileOutputStream(mOutputPdfFileName));
            doc.open();

            int allPage = imageUrllist.size();


            for (int i = 0; i < allPage; i++) {
                doc.newPage();

                BufferedImage read = ImageIO.read(new FileInputStream(imageUrllist.get(i)));

                Image png1 = Image.getInstance((java.awt.Image)ChangeBackToWhite.toWhite(read),null);
                //final String dest = (i + 1) + "";
                //doc.add(new Chunk().setLocalDestination(new String()));
                doc.add(png1);

            }

            creatCata(instance,fileName,allPage);


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

    public static void creatCata(PdfWriter instance, String fileName,int allPage) {


        final Duokan bookByName = DuoKanService.getBookByName(fileName);

        if(bookByName==null) return;

        String html = bookByName.getCatastring();

        if(html==null||html.length()<1) return;

        PdfContentByte cb = instance.getDirectContent();
        PdfOutline root = cb.getRootOutline();


        PageEntity pageEntityList = splitCataHTML.splitHTML(html);


        makeCata(  root,pageEntityList,instance,allPage);

                /*
        new PdfOutline(root, PdfAction.gotoLocalPage(1,new PdfDestination(1), instance), "Chapter 1");

        PdfOutline oline2 = new PdfOutline(root, PdfAction.gotoLocalPage(2,new PdfDestination(2), instance), "Chapter 2");
        oline2.setOpen(false);

        new PdfOutline(oline2,  PdfAction.gotoLocalPage(3,new PdfDestination(3), instance), "Sub 2.1");
        */
    }

    private static void makeCata( PdfOutline root,PageEntity pageEntityList,PdfWriter instance,int allPage)
    {
        java.util.List<PageEntity> peList = pageEntityList.getPeList();

        for (PageEntity pageEntity : peList) {
            if(pageEntity.getNum()>allPage) continue;
            PdfOutline oline2 = new PdfOutline(root, PdfAction.gotoLocalPage(pageEntity.getNum(),new PdfDestination(pageEntity.getNum()), instance), pageEntity.getName());
            if(pageEntity.getPeList()!=null&&pageEntity.getPeList().size()>0)
                makeCata(  oline2,pageEntity,instance,allPage);
        }
        return;
    }


    public static void main(String[] args) throws Exception {


        Map<String, String> stringStringMap = readConf.readFileByLines();


        String filePath = stringStringMap.get("pngPath");


        String outPath = stringStringMap.get("outPath");


        if (filePath == null || outPath == null || filePath.length() < 1 || outPath.length() < 1)
    {
        System.out.println("未配置outPath");
            return;

    }
        // TODO Auto-generated method stub
        ArrayList<String> imageUrllist =null;

        File basePath = new File(filePath);
        String[] dirList = basePath.list();
        for (String s : dirList) {
            if(s.equals("bin")||s.startsWith("old")) continue;

            File nowDir = new File(filePath+File.separator+s);

            imageUrllist = new ArrayList<String>();


            if(nowDir.isDirectory())
            {
                File nowDirPdf = new File(outPath+File.separator+s+".pdf");
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


                String pdfUrl = outPath+File.separator +BOOK_ID+".pdf";
                File file = Pdf(imageUrllist, pdfUrl,s);
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
