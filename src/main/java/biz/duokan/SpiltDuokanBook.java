package biz.duokan;

import core.util.HTMLUtil;

import java.util.List;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/9/23.
 * Description: 分解字符串插入数据库
 */
public class SpiltDuokanBook {

    public static String favString = "";


    public static void main(String[] args) {


        favString=favString.replaceAll("\n", "").replaceAll("\r", "");
        List<String> patternString = HTMLUtil.getPatternString(favString, "<a href=\"/book/.*?</a>");

        for (String bookString : patternString) {
            System.out.println(bookString);

            String id = HTMLUtil.getBetweenString(bookString, "href=\"/book/", "\" class=");
            String name = HTMLUtil.getBetweenString(bookString, "hidefocus\">", "</a>");
            SearchDuokanBookIntoDB.storeBook(id, name,"收藏夹");
        }


    }


}
