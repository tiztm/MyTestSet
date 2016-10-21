package biz.duokan;

import biz.duokan.utils.readConf;
import sun.jvmstat.monitor.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/10/10.
 */
public class ProcessCtrl {
    public static void main(String[] args) throws MonitorException, URISyntaxException, IOException, InterruptedException {


        Map<String, String> stringStringMap = readConf.readFileByLines();

        String curNum = stringStringMap.get("curNum");


        int num = 2;

        try {
            num = Integer.parseInt(curNum);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        System.out.println(num);
        while (true) {

            String nameFilter = "NativeInterface";

            List proList = printProcess(nameFilter);

            System.out.println("当前Java项目：" + proList.size());
            if (proList.size() < num) {
                String batFile = "1.抓取.bat";
                startBat(batFile);
            }

            Thread.sleep(60 * 1000l);
        }

    }

    private static void startBat(String batFile) throws IOException {


        Runtime.getRuntime().exec("cmd.exe  /C  start   " +batFile+
                "");

        System.out.println("启动:"+batFile);

    }

    private static List printProcess(String nameFilter) throws MonitorException, URISyntaxException {

        List<String> proList = new ArrayList();

        // 获取监控主机
        MonitoredHost local = MonitoredHost.getMonitoredHost("localhost");
        // 取得所有在活动的虚拟机集合
        Set<?> vmlist = new HashSet<Object>(local.activeVms());
        // 遍历集合，输出PID和进程名
        for(Object process : vmlist) {
            MonitoredVm vm = local.getMonitoredVm(new VmIdentifier("//" + process));
            // 获取类名
            String processname = MonitoredVmUtil.mainClass(vm, true);


            if(processname.contains(nameFilter))
            {
                proList.add(process.toString());
            }

            //System.out.println(process + " ------> " + processname);
        }


        return proList;
    }
}
