package biz.nilstest;

import java.util.regex.Pattern;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/11/4.
 */
public class testRegu {

    private static String CT="ct";
    private static String CM="cm";
    private static String CU="cu";

    private static String CT_REG="^189*$";

    private static String getMobileCorp(String mobile){
        if(Pattern.matches(CT_REG,mobile)){
            return CT;
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(getMobileCorp("18900000000"));
    }
}
