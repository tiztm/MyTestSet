package biz.duokan;

import core.util.HTMLUtil;
import core.util.HttpclientUtil;
import db.dao.DuokanDao;
import db.entity.Duokan;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/8/22.
 */
public class SearchDuokanBookIntoDB {

    private static  final  String book_start_url="http://www.duokan.com/search/";



    private static final int bookPerPage = 6;

    private  static  final  String keyword = "黑客与画家";

    private static final int bookNeed = 1;

    private  static  final int fiPage = bookNeed/bookPerPage+1;


    public static void main(String[] args) throws Exception {

        int bookCount = 0;


        for (int i = 1; i <=fiPage ; i++) {
            String url = book_start_url+keyword+"/"+i;
            System.out.println(url);

            String s = null;
            try {
                s = HttpclientUtil.get(url);
            } catch (Exception e) {
                e.printStackTrace();
                i--;
                Thread.sleep(5000l);
                continue;
            }
            s=s.replaceAll("\n", "").replaceAll("\r", "");
            List<String> patternString = HTMLUtil.getPatternString(s, "class=\"u-bookitm1 j-bookitm\".*?ondragstart=\"return false;\"");

            for (String s1 : patternString) {
                String id = HTMLUtil.getBetweenString(s1, "data-id=\"", "\"><div");
                String name = HTMLUtil.getBetweenString(s1, " alt=\"", "\" ondragstart");
                storeBook(id, name,keyword);
                bookCount++;
                if(bookCount>=bookNeed) System.exit(0);
            }



        }
    }

    public static void storeBook(String id, String name,String key) {
        System.out.println(id+"-"+name);

        Duokan bean = DuokanDao.dao.getBean("select * from duokan where url='" + id + "';");
        if(bean==null) {
            Duokan object = new Duokan();
            object.setName(name);
            object.setUrl(id);
            object.setIsdown(0);
            object.setIsread(0);
            object.setKeyword(key);

            DuokanDao.dao.save(object);
        }
    }
}
