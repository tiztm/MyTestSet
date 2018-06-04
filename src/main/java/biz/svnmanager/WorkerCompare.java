package biz.svnmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/1/17.
 */
public class WorkerCompare {

    public static void main(String[] args) {

        NowWorkers nw = new NowWorkers();

        //SVNWorkers nw = new SVNWorkers();

        SVNWorkers sw = new SVNWorkers();

        nw.readWorker();

        sw.readWorker();

        System.out.println(diffList(nw.nowWork,sw.svnworkers));

    }


    /**
     * 获取两个List的不同元素
     * @param list1
     * @param list2
     * @return
     */
    public static String diffList(List<String> list1, List<String> list2) {
        long st = System.nanoTime();
        Map<String,Integer> map = new HashMap<String,Integer>(list1.size()+list2.size());
        //List<String> diff = new ArrayList<String>();
        String diffNew = "";
        String diffDel = "";
        String diffEpal = "";
        for (String string : list1) {
            map.put(string, 1);
        }
        for (String string : list2) {
            Integer cc = map.get(string);
            if(cc!=null)
            {
                map.put(string, ++cc);
                continue;
            }
            map.put(string, -1);
        }
        for(Map.Entry<String, Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                diffNew = diffNew+entry.getKey()+",";
            }

            if(entry.getValue()==-1)
            {
                diffDel = diffDel+entry.getKey()+",";
            }

            if(entry.getValue()>1)
            {
                diffEpal = diffEpal+entry.getKey()+",";
            }


        }
        System.out.println("getDiffrent3 total times "+(System.nanoTime()-st));
        return "待添加："+diffNew.split(",").length+"-"+diffNew+"\r\n待删除:"+diffDel.split(",").length+"-"+diffDel+"\r\n都有:"+diffEpal.split(",").length+"-"+diffEpal;
    }


}
