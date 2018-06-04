package biz.nilstest;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/4/24.
 */
public class SVNSearch {
    public static void main(String[] args) throws IOException {

        String cmd = "C:\\SlikSvn\\bin\\svn.exe list -R https://202.102.101.40:2020/svn/镇江团队 > F:\\SVNINFO\\filelist.txt";


            Process process = Runtime.getRuntime().exec(cmd);

            InputStreamReader ir = new InputStreamReader(process.getInputStream());
            LineNumberReader input = new LineNumberReader(ir);

            String line;

            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }


    }
}
