package biz.aiwen;

import core.util.HttpclientUtil;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/9/19.
 */
public class testLink {

    public static void main(String[] args) throws Exception {
        String s = HttpclientUtil.get("http://weibo.com/1676457292/E6P69hdEq?from=page_1006061676457292_profile&wvr=6&mod=weibotime");
        System.out.println(s);
        System.out.println("-----------");
        s = HttpclientUtil.get("http://weibo.com/1676457292/E8NIFf2KS?from=page_1006061676457292_profile&wvr=6&mod=weibotime");
        System.out.println(s);


    }
}
