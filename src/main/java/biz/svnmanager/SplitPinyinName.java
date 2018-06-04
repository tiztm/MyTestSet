package biz.svnmanager;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import org.apache.commons.lang3.StringUtils;
/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/1/17.
 */
public class SplitPinyinName {





    public static void main(String[] args) {
        System.out.println(hanzi2Pinyin("张天明"));
    }

    public static String hanzi2Pinyin(String hanzi)
    {
        return convert(hanzi, HanyuPinyinCaseType.LOWERCASE, false);
    }


    /**
     * 转为拼音
     * @param text          待转化的中文字符
     * @param caseType      转化类型, 即大写小写
     * @param isCapitalize  是否首字母大写
     * @author lance
     * 2016年1月17日 下午10:28:05
     */
    public static String convert(String text, HanyuPinyinCaseType caseType, boolean isCapitalize) {
        if(StringUtils.isBlank(text)){
            return "";
        }
        HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
        if(caseType != null) {
            format.setCaseType(caseType);
            isCapitalize = false;
        }

        format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        format.setVCharType(HanyuPinyinVCharType.WITH_V);
        char[] input = StringUtils.trimToEmpty(text).toCharArray();
        StringBuilder builder = new StringBuilder();
        try {
            for (char c: input) {
                if (Character.toString(c).matches("[\\u4E00-\\u9FA5]+")) {
                    String[] temp = PinyinHelper.toHanyuPinyinStringArray(c, format);
                    if(isCapitalize) {
                        builder.append(StringUtils.capitalize(temp[0]));
                    }else {
                        builder.append(temp[0]);
                    }
                } else {
                    if(isCapitalize) {
                        builder.append(StringUtils.capitalize(Character.toString(c)));
                    }else {
                        builder.append(Character.toString(c));
                    }
                }
            }
        } catch (BadHanyuPinyinOutputFormatCombination ex) {
            ex.printStackTrace();
        }

        return builder.toString();
    }
}
