import com.rui.utils.DateSpanUtil;
import com.rui.utils.DateUtil;
import com.rui.utils.HTMLUtil;
import entity.NginxLogsEntity;
import org.apache.http.client.utils.DateUtils;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 快速跳到最近的N天的日志位置
 * 进行并发量，访问时间相关的统计
 * Created by nilszhang on 2016/2/17.
 * 从文件末尾以w为单位跳跃，发现时间差在4以上时，即刻进行查询
 */
public class NginxLogsAna {

    private static final String[] logPath ={"F:\\\\jipei.log"};// {"F:\\jipei.log", "F:\\hujiao.log", "F:\\jiesuan.log"};

    private static final int MIN_SHOW_TIME = 1;

    private static final double MIN_SHOW_SECOND = 1.5;

    private static Map<String, NginxLogsEntity> nleMap = new HashMap<String, NginxLogsEntity>();

    private static SimpleDateFormat dateSdf = new SimpleDateFormat("dd/MMM/yyyy",Locale.US);

    private static SimpleDateFormat minSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss",Locale.US);

    private static int allvisitTimes = 0;//总访问量

    private static int allvisitActionTimes = 0; //总非静态资源访问量(url中没有点的)

    private static int maxvisitInSecond = 0;

    private static String maxvisitInSecondTime = "";

    private static int nowvisitInSecond = 0;

    private static String nowvisitInSecondTime = "";

    private static Map<String, Integer> urlCountMap = new HashMap<String, Integer>();


    public static void main(String[] args) throws Exception {

        Date checkDate = new Date();

        int daysBack = -5;
        if(args.length>0&&args[0]!=null)
        {
            daysBack = Integer.parseInt(args[0]);
        }

        checkDate =  DateUtil.addDaysToDate(checkDate,daysBack);



//        Date checkDate = new Date();
//        System.out.println(sdf.format(checkDate));
//
//        String testTime = "10.10.10.9 - - [17/Feb/2016:11:31:13 +0800]";
//        Date d = spanTime(testTime);

        readNginxLog(dateSdf.format(checkDate));


    }

    private static Date spanTime(String testTime) {
        List<String> patternString = HTMLUtil.getPatternString(testTime, "- \\[.* \\+08");
        if(patternString.size()<1) return null;
        String s = patternString.get(0);
        s = s.replaceAll("- \\[","").replaceAll(" \\+08","");
        Date d = null;
       // System.out.println(s);
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return d;
    }


    /**
     * 处理Nginx的访问日志
     */
    private static void readNginxLog(String checkDate) {
        DateSpanUtil dsu = new DateSpanUtil();

        for (int i = 0; i < logPath.length; i++) {
            String o = logPath[i];
            File f = new File(o);
            readFileByLines(f,checkDate);
            dsu.getSpanDate();
        }
        System.out.println(checkDate+"的当天访问情况总结：");
        pringNleMap();
    }

    private static void pringNleMap() {


        System.out.println("访问数："+allvisitTimes);

        System.out.println("POST访问数："+allvisitActionTimes);

        System.out.println("最大每秒访问数："+maxvisitInSecondTime);

        System.out.println("最大每秒访问时间："+maxvisitInSecond);



        System.out.println("---");
        System.out.println("较慢请求");
        Set<String> strings = nleMap.keySet();
        for (String s : strings  ) {
            NginxLogsEntity nginxLogsEntity = nleMap.get(s);
            if (nginxLogsEntity.getShowTime() > MIN_SHOW_TIME) {
                System.out.println(nginxLogsEntity.toString());
            }
        }
        System.out.println("---");
        System.out.println("访问情况"+urlCountMap.size());
//        Set<String> urlCount = urlCountMap.keySet();
//        for (String s2:urlCount)
//        {
//            System.out.println(strings+","+urlCountMap.get(s2));
//        }

    }

    /**
     * 检查每日访问次数
     * @param url 访问的url
     */
    public static void anaAllvisiteCost(Date d,String url) {
        allvisitTimes ++;
        if (url.startsWith("POST")) allvisitActionTimes++;
        String format = minSdf.format(d);


        if(nowvisitInSecondTime.equals(d.toString()))
        {
            nowvisitInSecond ++;
        }
        else
        {
            if(maxvisitInSecond<nowvisitInSecond)
            {
                maxvisitInSecondTime = nowvisitInSecondTime;
                maxvisitInSecond = nowvisitInSecond;
            }
            nowvisitInSecondTime = d.toString();
            nowvisitInSecond = 0;
        }

        Integer count = urlCountMap.get(format);
        if (count==null)
        {
            urlCountMap.put(format,1);
        }
        else {
            urlCountMap.put(format,count+1);
        }


    }


    /**
     * 检查每日耗时情况
     * @param str
     */
    public static void anaAllCost1(String str) {

    }

    /**
     * 检查传入信息的总耗时情况
     * @param str
     */
    public static void anaAllCost(String str) {

        String[] split = str.split(" \"");



        if (split.length == 8) {
            Date date = spanTime(split[0]);

            anaAllvisiteCost(date,split[1]);



            String s = split[7];
            s = s.replaceAll("\"", "");
            Double timeIns = Double.parseDouble(s);
            if (timeIns >MIN_SHOW_SECOND) {
                List<String> patternString = HTMLUtil.getPatternString(split[1], "(/.*){1,4}( HTTP)");
                if (patternString.size() < 1) {
                    System.out.println(split[1] + " - " + timeIns);
                    return;
                }
                String pStr = patternString.size() > 0 ? patternString.get(0) : "";//split[1];
                int lastIndexOf = pStr.lastIndexOf("?");
                if (lastIndexOf > 0)
                    pStr = pStr.substring(0, lastIndexOf);
                NginxLogsEntity nginxLogsEntity = nleMap.get(pStr);

                if (nginxLogsEntity == null) {
                    NginxLogsEntity nle = new NginxLogsEntity();
                    nle.setLogUrl(pStr);
                    nle.setAllCostTime(timeIns);
                    nle.setShowTime(1);
                    nle.setLastShow(date +"");
                    nleMap.put(pStr, nle);
                } else {
                    nginxLogsEntity.setShowTime(nginxLogsEntity.getShowTime() + 1);
                    nginxLogsEntity.setLastShow(date +"");
                    nginxLogsEntity.setAllCostTime(nginxLogsEntity.getAllCostTime() + timeIns);
                }
            }
        }

    }


    //private static int OVER_LENGTH = 1500;


    /**
     * 读取文件最后N行
     *
     * 根据换行符判断当前的行数，
     * 使用统计来判断当前读取第N行
     *
     * PS:输出的List是倒叙，需要对List反转输出
     *

    public static void readLastNLine(File file,String beginStr)
    {

        //行数统计
        long count = 0;

        // 排除不可读状态
        if (!file.exists() || file.isDirectory() || !file.canRead())
        {
            return ;
        }

        long beginCur = 0;

        // 使用随机读取
        RandomAccessFile fileRead = null;
        try
        {
            //使用读模式
            fileRead = new RandomAccessFile(file, "r");
            //读取文件长度
            long length = fileRead.length();
            System.out.println(length);
            //如果是0，代表是空文件，直接返回空结果
            if (length == 0L)
            {
                return ;
            }
            else
            {
                //初始化游标
                long pos = length - 1;
                while (pos > 0)
                {
                    count++;
                    pos = pos - OVER_LENGTH;
                    //开始读取
                    fileRead.seek(pos);
                    //如果读取到\n代表是读取到一行
                    if (fileRead.readByte() == '\n')
                    {

                        //使用readLine获取当前行
                        String line = fileRead.readLine();
                        //保存结果
                        if(line.contains(beginStr))
                        {
                            //打印当前行
                            //System.out.println(pos+"_"+line+"_"+count);

                            beginCur = pos;
                            break;
                        }



                    }
                }
                if (pos == 0)
                {
                    fileRead.seek(0);

                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (fileRead != null)
            {
                try
                {
                    //关闭资源
                    fileRead.close();
                }
                catch (Exception e)
                {
                }
            }
        }

        readFileByLines(file,beginCur,"");


        return ;
    }*/

    public static void readFileByLines(File f) {
        readFileByLines(f,"");
    }

    public static void readFileByLines(File f,String beginStr) {
        File file = f;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            while ((tempString = reader.readLine()) != null) {
                //把当前行号显示出来
                // System.out.println("line " + line + ": " + tempString);
                line++;
                //if(line<beginCur) continue;
                if(!tempString.contains(beginStr)) continue;

                anaAllCost(tempString);

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }

}
