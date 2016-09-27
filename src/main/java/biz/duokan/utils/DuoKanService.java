package biz.duokan.utils;

import biz.duokan.PrintDuokan;
import db.dao.DuokanDao;
import db.entity.Duokan;

import java.io.File;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/9/22.
 */
public class DuoKanService {

    private static String basePath = PrintDuokan.filePath;


    public static  Duokan rtnNextBook()
    {
        Duokan bean = null;

        while (true) {
            bean = DuokanDao.dao.getBean("select * from duokan where isdown=0 and (isrunning is null or isrunning !=1)  order by ord desc;");
            if(bean==null) break;

            File pdfFile = new File(basePath+bean.getName());
            if(pdfFile.exists())
            {
                endBook(bean.getId());
            }
            else {
                pdfFile = new File(basePath+bean.getName()+".pdf");
                if(pdfFile.exists())
                {
                    endBook(bean.getId());
                }
                else {
                    return  bean;
                }
            }

        }

        return null;
    }

    public static void runningBook(Integer id)
    {
        Duokan bean = new Duokan();

        bean.setId(id);

        bean.setIsrunning(1);

        DuokanDao.dao.update(bean);
    }

    public static void endBook(Integer id)
    {
        Duokan bean = new Duokan();

        bean.setId(id);

        bean.setIsrunning(0);

        bean.setIsdown(1);

        DuokanDao.dao.update(bean);
    }







}
