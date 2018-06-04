package biz.nilstest;

import core.util.HttpclientUtil;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/11/9.
 */
public class FlashUploadBugTest {

    public static void main(String[] args) {
        String[] xiangmu = {"http://jsgj.jsce.gov.cn/"};

        for (String s : xiangmu) {

            String ctnt = "";

            try {
                ctnt = HttpclientUtil.get(s + "flashupload.action");
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(ctnt.contains("alert('上传成功！');"))
                System.out.println(s+"- 存在开发平台漏洞！");



        }

    }
}
