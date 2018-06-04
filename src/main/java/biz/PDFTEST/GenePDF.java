package biz.PDFTEST;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Image;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfWriter;

public class GenePDF {


    public static void main22(String[] args) {
        System.out.println("begin");

        String [] head = {"name","sex","adress","height","age","jj"};

        List<Repair> list = new ArrayList<Repair>();
        Repair user1 = new Repair("zhangsan","北京","男","北京","男");
        Repair user2 = new Repair("lisi","北京","男","上海","女");

        list.add(user1);
        list.add(user2);


        String filePath = new CreatePdf().generatePDFs(head,list);
        System.out.println(filePath);
        System.out.println("end");
    }


    public static void main(String[] args) throws IOException {

        //创建一个文档对象

        Document doc = new Document();

        try {

            // 定义输出位置并把文档对象装入输出对象中

            PdfWriter.getInstance(doc, new FileOutputStream("D:\\test\\111.pdf"));

            // 打开文档对象

            doc.open();

            // 设置中文字体



            // 加入文字“HelloWorld ------ 中国北京,我的2008 .”

            String str = "NO in.";

            Paragraph tt = new Paragraph(str);

            doc.add(tt);

            // 加入图片Deepinpl.jpg

            Image jpg = Image.getInstance("D:\\test\\111.png");

            jpg.setAlignment(Image.ALIGN_RIGHT);

            doc.add(jpg);

            // 关闭文档对象，释放资源

            doc.close();




        } catch (Exception e) {

            e.printStackTrace();

        }

        System.out.println("OK");

    }

}