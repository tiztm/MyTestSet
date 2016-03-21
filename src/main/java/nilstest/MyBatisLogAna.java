package nilstest;

import com.rui.utils.DateUtil;
import com.rui.utils.HTMLUtil;
import entity.MybatisLogsEntity;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 统计MyBatis的输出日志。
 *
 * Log4j 格式
 * Created by nilszhang on 2016/3/1.
 */
public class MyBatisLogAna {

    private final static String LOG_FILE_NAME = "hlg_mybatis.log.";

    private static Map<String, MybatisLogsEntity> tempmleMap = new HashMap<String, MybatisLogsEntity>();


    private static Map<String, MybatisLogsEntity> mleMap = new HashMap<String, MybatisLogsEntity>();


    private static Map<String, MybatisLogsEntity> mleMapWithOutParam = new HashMap<String, MybatisLogsEntity>();


    private static SimpleDateFormat fileSdf = new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat logSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");



    public static void main(String[] args) throws Exception {

        Date checkDate = new Date();


        // 根据输入的值计算要统计的天

        int daysBack = -1;
        if(args.length>0&&args[0]!=null)
        {
            daysBack = Integer.parseInt(args[0]);
        }
        checkDate =  DateUtil.addDaysToDate(checkDate,daysBack);




        readMybatisLog(checkDate);


    }

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

    private static void readMybatisLog(Date da) {

        String fileStr = LOG_FILE_NAME + fileSdf.format(da);


        for (int i = 0; i < 9999; i++) {

            String subStr = i==0?"":("-"+i);
            File f = new File(fileStr+subStr);
            if(f.exists()) {

                readFileByLines(f);
            }
            else
            {
                if(i!=0)
                    break;
            }

        }




        outMap(mleMapWithOutParam);

        String format = fileSdf.format(da);

        log2File(format+"_withOutParam.csv",out2File.toString());

        out2File = new StringBuffer();


        outMap(mleMap);

        log2File(format+"_withParam.csv",out2File.toString());



    }


    private static StringBuffer out2File = new StringBuffer();

    private static void outMap(Map<String, MybatisLogsEntity> mleMapWithOutParam) {

        Set<String> strings = mleMapWithOutParam.keySet();
        List<MybatisLogsEntity> nleList = new ArrayList<MybatisLogsEntity>();


        for (String s : strings  ) {
            MybatisLogsEntity mle = mleMapWithOutParam.get(s);

            out2File.append(mle.toString()+"\n");


        }

    }


    public static void readFileByLines(File f) {
        File file = f;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            while ((tempString = reader.readLine()) != null) {
                //把当前行号显示出来
                 //System.out.println("line " + line + ": " + tempString);
                if(tempString.contains("com.hletong.common"))
                {
                    anaStr(tempString);
                }
                line++;

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




    private static void anaStr(String tempString) {


        //sqlName
        String sqlName = HTMLUtil.getBetweenString(tempString, "com.hletong.common"," -");
        //时间。
        String nowTime = tempString.substring(0, 23);
        Date parse = null;
        try {
            parse = logSdf.parse(nowTime);
        } catch (ParseException e) {
            //e.printStackTrace();
            return;
        }
        if(sqlName.length()>0)
        {
            MybatisLogsEntity mybatisLogsEntity = tempmleMap.get(sqlName);
            if(mybatisLogsEntity==null)
            {
                //在临时Map里没有该Entity的时候，新增临时entity
                //sql
                String sql = HTMLUtil.getBetweenString(tempString, "Preparing: "," -org");
                if(sql.length()>0){

                    tempmleMap.put(sqlName,new MybatisLogsEntity(sqlName,sql, parse));

                }

            }
            else
            {

                //sqlParam
                String sqlParam = HTMLUtil.getBetweenString(tempString, "Parameters: ", " -org");

                if(mybatisLogsEntity.getSqlParam()==null) {
                    if (!tempString.contains("Parameters:")) return;
                    mybatisLogsEntity.setSqlParam(sqlParam);
                }
                else{
                    //在sql和param都有的情况下，应该匹配一个返回
                    if(tempString.contains("-<=="))
                    {
                        long diff = (parse.getTime() - mybatisLogsEntity.getBeginDate().getTime());

                        //对时间较长的进行记录。
                        if(diff>1000)
                        {

                            mybatisLogsEntity.setHeavyAllCostTime(diff);
                            logMyBatisEntity(mybatisLogsEntity);

                        }
                        tempmleMap.remove(sqlName);
                    }
                }



            }
        }







       // System.out.println(nowTime);




    }

    private static void logMyBatisEntity(MybatisLogsEntity mybatisLogsEntity) {

        MybatisLogsEntity mle = mleMapWithOutParam.get(mybatisLogsEntity.getSqlName());
        mleListCompare(mybatisLogsEntity,mle,mleMapWithOutParam,mybatisLogsEntity.getSqlName());


        MybatisLogsEntity mleWhitParam = mleMap.get(mybatisLogsEntity.getSqlName()+"_"+mybatisLogsEntity.getSqlParam());
        mleListCompare(mybatisLogsEntity, mleWhitParam,mleMap,mybatisLogsEntity.getSqlName()+"_"+mybatisLogsEntity.getSqlParam());


    }

    private static void mleListCompare(MybatisLogsEntity mybatisLogsEntity, MybatisLogsEntity mleWhitParam,Map m,String mapKey) {

        if(mleWhitParam == null)
        {

            mybatisLogsEntity.setCount(1);
            mybatisLogsEntity.setHeavyCount(1);
            m.put(mapKey,mybatisLogsEntity);
        }
        else
        {
            mleWhitParam.setHeavyCount(mleWhitParam.getHeavyCount()+1);
            mleWhitParam.setHeavyAllCostTime(mleWhitParam.getHeavyAllCostTime()+mybatisLogsEntity.getHeavyAllCostTime());

        }
    }

}
