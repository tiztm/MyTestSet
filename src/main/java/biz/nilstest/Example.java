package biz.nilstest;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/7/8.
 */
public class Example {
    public static String convertToLowerCase(String s){//Don't write main() function
            return  s.toLowerCase();
    }

    public static String Hanzi(String n){//Don't write main() function
        int hanziNum = 0;
        try{
            char[] allHChar = n.toCharArray();
            for(int i = 0; i < allHChar.length; i++){
                char c = allHChar[i];
                if((c >= 0x4e00)&&(c <= 0x9fbb))
                    hanziNum++;
            }
        }catch(Exception e){}
        return "Hanzi:"+hanziNum;
    }


    public static String getSeason(int m){//Don't write main() function



        if(m>=3&&m<=5) return m+"月属于Spring";
        if(m>=6&&m<=8) return m+"月属于Summer";
        if(m>=9&&m<=11) return m+"月属于Autumn";
        if(m==1||m==2||m==12) return m+"月属于Winter";

        return "错误月份";

    }

    public static void main(String args[]){

        for (int i = 1; i < 13; i++) {
            System.out.println(getSeason(i));
        }

        }
}


/**
 *
 int num = 0;
 try{
 char[] chars = s.toCharArray();
 for(int i = 0; i < chars.length; i++){
 char c = chars[i];
 if((c >= 0x4e00)&&(c <= 0x9fbb))
 num++;
 }
 }catch(Exception e){}
 return "Hanzi:"+num;


 int num = 0;
 try{
 char[] chars = s.toCharArray();
 for(int i = 0; i < chars.length; i++){
 char c = chars[i];
 if((c >= 0x4e00)&&(c <= 0x9fbb))
 num++;
 }
 }catch(Exception e){}
 return "Hanzi:"+num;


 *
 **/