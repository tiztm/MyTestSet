package biz.nilstest;

import biz.nilstest.entity.NginxLogsEntity;
import core.util.DateSpanUtil;
import core.util.DateUtil;
import core.util.HTMLUtil;

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
public class NginxLogsAnaTykd {

    private static final String[] logPath ={"C:\\Users\\nilszhang\\Desktop\\kd9000.2017-04-01.log"};

    private static final int MIN_SHOW_TIME = 2;

    private static final double MIN_SHOW_SECOND = 0.1;

    private static Map<String, Integer> nleMap = new HashMap<String, Integer>();

    private static SimpleDateFormat dateSdf = new SimpleDateFormat("dd/MMM/yyyy",Locale.US);

    private static SimpleDateFormat fileSdf = new SimpleDateFormat("yyyy-MM-dd",Locale.US);

    private static SimpleDateFormat minSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss",Locale.US);

    private static int allvisitTimes = 0;//总访问量

    private static int allvisitActionTimes = 0; //总非静态资源访问量(url中没有点的)

    private static int maxvisitInSecond = 0;

    private static String maxvisitInSecondTime = "";

    private static int nowvisitInSecond = 0;

    private static String nowvisitInSecondTime = "";

    private static int maxPostvisitInSecond = 0;

    private static String maxPostvisitInSecondTime = "";

    private static int nowPostvisitInSecond = 0;

    private static String nowPostvisitInSecondTime = "";

    private static Map<String, Integer> urlCountMap = new HashMap<String, Integer>();

    /**
     * 在当前路径下存放 content
     * @param fileName
     * @param content
     */
    public static void log2File(String fileName,String content){


        FileOutputStream out = null;
        File file;
        try {

            File fileDat = new File(fileName);

            out = new FileOutputStream(fileDat);
            byte[] contentInBytes = content.getBytes();
            out.write(contentInBytes);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    public static Map<String, Integer> sortMapByValue(Map<String, Integer> oriMap) {
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        if (oriMap != null && !oriMap.isEmpty()) {
            List<Map.Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(oriMap.entrySet());
            Collections.sort(entryList,
                    new Comparator<Map.Entry<String, Integer>>() {
                        public int compare(Map.Entry<String, Integer> entry1,
                                           Map.Entry<String, Integer> entry2) {
                            int value1 = 0, value2 = 0;
                            try {
                                value1 = entry1.getValue();
                                value2 = entry2.getValue();
                            } catch (NumberFormatException e) {
                                value1 = 0;
                                value2 = 0;
                            }
                            return value2 - value1;
                        }
                    });
            Iterator<Map.Entry<String, Integer>> iter = entryList.iterator();
            Map.Entry<String, Integer> tmpEntry = null;
            while (iter.hasNext()) {
                tmpEntry = iter.next();
                sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
            }
        }
        return sortedMap;
    }



    public static void main(String[] args) throws Exception {

        Date checkDate = new Date();
//        String s = "1235";
//
//        String format = fileSdf.format(checkDate);
//
//        log2File(format+".txt",s);


       // 根据输入的值计算要统计的天

        int daysBack = -100;
        if(args.length>0&&args[0]!=null)
        {
            daysBack = Integer.parseInt(args[0]);
        }
        checkDate =  DateUtil.addDaysToDate(checkDate,daysBack);


        readNginxLog(checkDate);


    }

    /**
     * 解析Nignx的时间格式
     * @param testTime
     * @return
     */
    private static Date spanTime(String testTime) {

        String s = testTime.substring(1);
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
    private static void readNginxLog(Date checkDate) {

        String checkDateStr = "";//dateSdf.format(checkDate);

        DateSpanUtil dsu = new DateSpanUtil();

        for (int i = 0; i < logPath.length; i++) {
            String o = logPath[i];
            File f = new File(o);
            readFileByLines(f,checkDateStr);
            dsu.getSpanDate();


            pringNleMap();
            log2File(o+"_common.csv",out2File.toString());
            out2File =  new StringBuffer();

            nleMap =  new HashMap<String, Integer>();


        }





    }

    private static StringBuffer out2File = new StringBuffer();

    private static StringBuffer out2QingqiuFile = new StringBuffer();

    private static void pringNleMap() {

        Map<String, Integer>  sortMap =  sortMapByValue(nleMap);

        Set<String> strings = sortMap.keySet();
        for (String string : strings) {

            out2File.append(string+","+sortMap.get(string)+"\n");
        }



    }

    /**
     * 检查每日访问次数
     * @param url 访问的url
     */
    public static void anaAllvisiteCost(Date d,String url) {
        allvisitTimes ++;
        if (url.startsWith("POST"))
        {
            allvisitActionTimes++;


            if(nowPostvisitInSecondTime.equals(d.toString()))
            {
                nowPostvisitInSecond ++;
            }
            else
            {
                if(maxPostvisitInSecond<nowPostvisitInSecond)
                {
                    maxPostvisitInSecondTime = nowPostvisitInSecondTime;
                    maxPostvisitInSecond = nowPostvisitInSecond;
                }
                nowPostvisitInSecondTime = d.toString();
                nowPostvisitInSecond = 0;
            }

        }
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

        String[] split = str.split(" ");



        if (split.length == 12) {
            Date date = spanTime(split[3]);

            if(date==null) return;
            anaAllvisiteCost(date,split[1]);

            String ip =split[0];
            String url = split[6];

            if(url.contains("MobileService")) url = "MobileService";
            if(url.contains("ios.txt")) url = "ios.txt";
            if(url.contains("DeviceRegisterServlet")) url = "DeviceRegisterServlet";
            if(url.contains("DataDownService")) url = "DataDownService";


            String key = url +"-"+split[8];


            if(nleMap.get(key)==null)
                nleMap.put(key,1);
            else
                nleMap.put(key,nleMap.get(key)+1);



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
