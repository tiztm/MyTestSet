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
public class SVNWorkers {

    List<String> svnworkers = new ArrayList<>();




    public  void readWorker() {
        try {
        String s = null;
        BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入：");
        int num = 1;
        while (!"end".equals(s))
        {

            s = strin.readLine();
            if(!s.equals("end")) {
                String[] split = s.split(":");

                System.out.println(split[0]);

                svnworkers.add(split[0]);

            }
        }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
