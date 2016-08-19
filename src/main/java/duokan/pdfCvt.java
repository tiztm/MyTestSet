package duokan;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;


import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;


/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/8/17.
 */
public class pdfCvt {


    /**
     * !!!最重要!!!
     * 扫描的书籍ID
     */
    final static String BOOK_ID = "ad732c840fd441638c443ac48a51e573";

    private static String filePath =  "D:\\test\\" ;


    public static File Pdf(ArrayList<String> imageUrllist, String mOutputPdfFileName) {
        String TAG = "PdfManager";
        Document doc = new Document(new Rectangle(426, 570),0,0,0,0);
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
        ArrayList<String> imageUrllist = new ArrayList<String>();


        String path =filePath+BOOK_ID+"\\";

        File fPath = new File(path);

        String[] list = fPath.list();


        for (int i = 0; i <list.length ; i++) {
            imageUrllist.add(path + list[i]);
        }


        String pdfUrl = "d:\\test\\" +BOOK_ID+
                ".pdf";
        File file = Pdf(imageUrllist, pdfUrl);
        try {
            file.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
