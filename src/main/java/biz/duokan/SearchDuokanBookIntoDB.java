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

    private  static  final  String keyword = "科幻世界";

    private  static  final int fiPage = 16;


    public static void main(String[] args) throws Exception {


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


                System.out.println(id+"-"+name);

                Duokan bean = DuokanDao.dao.getBean("select * from duokan where url='" + id + "';");
                if(bean==null) {
                    Duokan object = new Duokan();
                    object.setName(name);
                    object.setUrl(id);
                    object.setIsdown(0);
                    object.setIsread(0);
                    object.setKeyword(keyword);

                    DuokanDao.dao.save(object);
                }

            }



        }
    }
}
