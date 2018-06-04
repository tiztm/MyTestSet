package biz.svnmanager;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/1/17.
 */
public class NowWorkers {


    List<String>  nowWork = new ArrayList<>();




    public void readWorker() {
        try {
            String s = null;

            BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("请输入：");
            int num = 1;

            while (!"end".equals(s))
            {

                s = strin.readLine();


                if(!s.equals("end")) {
                    String pinyinname = SplitPinyinName.hanzi2Pinyin(s);
                    System.out.println(num + "：" + s + "-" + pinyinname);
                    nowWork.add(pinyinname);
                    num++;
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
