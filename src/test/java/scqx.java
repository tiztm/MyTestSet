/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/12/7.
 */
public class scqx {

    public static void main(String[] args) {
        String ddd = "户主或与户主关系\n" +
                "性别\n" +
                "民族\n" +
                "出生地\n" +
                "户籍地\n" +
                "曾用名\n" +
                "出生日期\n" +
                "宗教信仰\n" +
                "身高\n" +
                "婚姻状况\n" +
                "文化程度\n" +
                "血型\n" +
                "身份证号码\n" +
                "姓名\n";


        String fff = "身份证号码\n" +
                "入住宾馆\n" +
                "入住城市\n" +
                "宾馆地址\n" +
                "入住日期\n" +
                "入住天数\n" +
                "同住人姓名\n" +
                "同住人身份证号码\n" +
                "离开日期\n" +
                "备注\n" +
                "姓名\n";


        String[] split = fff.split("\n");

        String s = "";

        for (String no : split) {


            s += "\t\t\t\t\t\t\t\t\t\t<li>\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t<div class=\"ty-tree-div\">\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"tyue-checkbox-wrapper\">\n" +
                    "                            <span class=\"tyue-checkbox\">\n" +
                    "                                <input type=\"checkbox\" class=\"tyue-checkbox-input\" id=\"tyue-checkbox-blue\">\n" +
                    "                                <span class=\"tyue-checkbox-circle\">\n" +
                    "                                </span>\n" +
                    "                            </span>\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"tyue-checkbox-txt\" title=\"" +no+
                    "\">\n" +
                    "                                " +no+
                    "\n" +
                    "                            </span>\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t</label>\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
                    "\t\t\t\t\t\t\t\t\t\t</li>";


        }



        System.out.println(s);
    }
}
