package biz.nilstest;

import core.util.DateSpanUtil;
import core.util.DateUtil;
import core.util.HTMLUtil;
import biz.nilstest.entity.NginxLogsEntity;

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

    private static final String[] logPath ={"F://jipei.log"};

    private static final int MIN_SHOW_TIME = 2;

    private static final double MIN_SHOW_SECOND = 0.1;

    private static Map<String, NginxLogsEntity> nleMap = new HashMap<String, NginxLogsEntity>();

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

//        File directory = new File("");//设定为当前文件夹
//        String absolutePath = directory.getAbsolutePath();
//        System.out.println(absolutePath);//获取绝对路径


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
    private static void readNginxLog(Date checkDate) {

        String checkDateStr = dateSdf.format(checkDate);

        DateSpanUtil dsu = new DateSpanUtil();

        for (int i = 0; i < logPath.length; i++) {
            String o = logPath[i];
            File f = new File(o);
            readFileByLines(f,checkDateStr);
            dsu.getSpanDate();
        }

        String format = fileSdf.format(checkDate);
        out2File.append("总结-"+format+"的当天访问情况："+"\n");
        pringNleMap();
        System.out.println(out2File.toString());
        log2File(format+"_common.txt",out2File.toString());
        log2File(format+"_slow.csv",out2QingqiuFile.toString());


    }

    private static StringBuffer out2File = new StringBuffer();

    private static StringBuffer out2QingqiuFile = new StringBuffer();

    private static void pringNleMap() {


        out2File.append("访问数："+allvisitTimes+"\n");

        out2File.append("POST访问数："+allvisitActionTimes+"\n");

        out2File.append("最大每秒访问数："+maxvisitInSecondTime+"\n");

        out2File.append("最大每秒访问时间："+maxvisitInSecond+"\n");

        out2File.append("最大POST每秒访问数："+maxPostvisitInSecondTime+"\n");

        out2File.append("最大POST每秒访问时间："+maxPostvisitInSecond+"\n");


        out2File.append("---"+"\n");
        out2File.append("最慢的十个较慢请求"+"\n");

        Set<String> strings = nleMap.keySet();
        List<NginxLogsEntity> nleList = new ArrayList<NginxLogsEntity>();


        for (String s : strings  ) {
            NginxLogsEntity nginxLogsEntity = nleMap.get(s);

            if (nginxLogsEntity.getShowTime() > MIN_SHOW_TIME) {
                nleList.add(nginxLogsEntity);
            }
        }

        // 按出现自出倒序
        Collections.sort(nleList, new Comparator<NginxLogsEntity>() {
            public int compare(NginxLogsEntity arg0, NginxLogsEntity arg1) {
                int hits0 = arg0.getShowTime();
                int hits1 = arg1.getShowTime();
                if (hits1 > hits0) {
                    return 1;
                } else if (hits1 == hits0) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });

        int countSlow = 0;
        out2QingqiuFile.append("地址,最后一次访问时间,总访问次数,慢访问次数,总慢访问时间,平均慢访问响应时间,慢访问比率"+ "\n");
        for (NginxLogsEntity nle:nleList){
            if(countSlow<10) {
                out2File.append(nle.toString() + "\n");
                countSlow++;
            }
            out2QingqiuFile.append(nle.toString()+"\n");
        }



        //System.out.println("---");
        //System.out.println("访问情况"+urlCountMap.size());


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

        String[] split = str.split(" \"");



        if (split.length == 8) {
            Date date = spanTime(split[0]);

            if(date==null) return;
            anaAllvisiteCost(date,split[1]);



            String s = split[7];
            s = s.replaceAll("\"", "");
            Double timeIns = Double.parseDouble(s);

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

                    if (timeIns >MIN_SHOW_SECOND) {
                    nle.setAllCostTime(timeIns);
                    nle.setShowTime(1);
                    nle.setLastShow(date +"");
                    }
                    else
                    {
                        nle.setAllCostTime(0);
                        nle.setShowTime(0);
                        nle.setLastShow("");
                    }
                    nle.setAllShowTime(1);

                    nleMap.put(pStr, nle);
                } else {
                    nginxLogsEntity.setAllShowTime(nginxLogsEntity.getAllShowTime() + 1);
                    if (timeIns >MIN_SHOW_SECOND) {
                        nginxLogsEntity.setShowTime(nginxLogsEntity.getShowTime() + 1);
                        nginxLogsEntity.setLastShow(date + "");
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
