package biz.duokan;

import biz.duokan.entity.PageEntity;
import biz.duokan.utils.DuoKanService;
import biz.duokan.utils.splitCataHTML;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import db.entity.Duokan;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/10/21.
 */
public class MakePDFCata {

    public static void main(String[] args) throws IOException, DocumentException {

        Duokan bookByName = DuoKanService.getBookByName("Oracle数据库性能优化方法论和最佳实践");


        if(bookByName==null) return;

        String html = bookByName.getCatastring();

        PageEntity pageEntityList = splitCataHTML.splitHTML(html);

        System.out.println(pageEntityList);

    }
}
