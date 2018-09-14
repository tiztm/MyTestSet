package biz.nilstest;

import biz.nilstest.entity.NginxEntity;
import biz.nilstest.entity.NginxLogsEntity;
import core.util.DateSpanUtil;
import core.util.HTMLUtil;

import java.io.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

/**
 * 快速跳到最近的N天的日志位置
 * 进行并发量，访问时间相关的统计
 * Created by nilszhang on 2016/2/17.
 * 从文件末尾以w为单位跳跃，发现时间差在4以上时，即刻进行查询
 */
public class NginxLogsAnaZZYTAna {

    private static final String[] sqlStr ={"select count(*) from nginx_log",
           // "select url,LENGTH , SERVLET_RESPO_TIME ,ALL_RESPO_TIME from nginx_log where SERVLET_RESPO_TIME >0 and (url like '%action%' or url like '%gridClient%') order by SERVLET_RESPO_TIME desc limit 200",
            "select  t.url  , count( t.url  ),sum (t.SERVLET_RESPO_TIME )/count( t.url )  from nginx_log t group by t.url  having  count( t.url  ) >500     order by sum (t.SERVLET_RESPO_TIME )/count( t.url   ) desc  limit 50;",
            //"select t.url,count(t.url) from nginx_log t where t.RTN_CODE like '50%' group by t.url  order by count(t.url) desc limit 50;",
            "select t.url,count(t.url) from nginx_log t group by t.url order by count(t.url) desc limit 20;",
            "select t.url,count(t.url),sum(case  when  t.RTN_CODE like '50%'  then 1 else 0 end) as wrong from nginx_log t group by t.url   having  wrong >1     order by wrong desc limit 20;",
            "select t.RTN_CODE,count(t.rtn_code) from nginx_log t group by  t.RTN_CODE order by count(t.rtn_code)  desc limit 15;",
            "select t.url ,count(t.url ) from nginx_log t where t.url like '%action%' and t.length>5000000 group by t.url",
            "select  to_char(LOGON_TIME,'yyyy-MM-dd HH24')  as hours ,count(   to_char(LOGON_TIME,'yyyy-MM-dd HH24')   ) from nginx_log group by to_char(LOGON_TIME,'yyyy-MM-dd HH24')  order by hours ;",
            "select to_char(LOGON_TIME,'yyyy-MM-dd hh24:mi:ss')  as seconds ,count(to_char(LOGON_TIME,'yyyy-MM-dd hh24:mi:ss') )    from nginx_log group by to_char(LOGON_TIME,'yyyy-MM-dd hh24:mi:ss')  order by count(to_char(LOGON_TIME,'yyyy-MM-dd hh24:mi:ss') )  desc  limit 20;",
            "select count(*) from (select t.CLIENT_IP   ,count(t.CLIENT_IP   ) from nginx_log t  group by t.CLIENT_IP    having count(t.CLIENT_IP   )  > 2  ) as newT ;"
            ,"select t.url,count(t.url),sum(case  when  t.RTN_CODE like '50%'  then 1 else 0 end) as wrong from nginx_log t where t.url like '%xam%json%'  group by t.url  order by count(t.url) desc limit 20;"
    };

    private static final String[] nameStr ={"请求总记录数",
            //"最耗时的100个请求",
            "平均耗时前50且访问超过500次的的请求",
            //"报错URL统计",
            "请求次数前20的URL",
            "报错次数前20的URL与请求数比较",
            "HTTP响应返回码分析",
            "返回值过大(5mb)的请求",
            "每小时时间段返回请求个数",
            "最大每秒同时请求次数",
            "活跃IP数（访问次数大于2） 统计",
            "大比武统计"
    };


    static DateSpanUtil dsu = new DateSpanUtil();

    public static void main(String[] args) throws Exception {

        String dbName = "log201";

        genelog(dbName);

        dbName = "log202";

        genelog(dbName);



    }

    public static void genelog(String dbName) {
        try {

            System.out.println("----------数据库"+dbName+"的日志------------");

            System.out.println();

            //登陆H2
            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.
                    getConnection("jdbc:h2:tcp://localhost/mem:" +dbName+
                            ";DB_CLOSE_DELAY=-1", "sa", "");
            // add application code here
            Statement stmt = conn.createStatement();

            int i = 0;
                //批量执行语句
                    for (String sql : sqlStr) {
                        System.out.println(nameStr[i]+"-----------------");
                        ResultSet rs = stmt.executeQuery(sql);

                        //遍历结果集
                        while (rs.next()) {

                            int row = rs.getMetaData().getColumnCount();




                            for(int j=1;j<=row;j++)
                            {
                                int len = 110;
                                if(j>1) {
                                    len = 8;
                                }

                                System.out.print(getFixedLenString(rs.getString(j),len,' ' )+"|");
                            }




                            System.out.println("");
                        }
                        rs.close();

                        i++;


                        System.out.println("");

                        System.out.println("");

                    }


                //退出
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    public static String getFixedLenString(String str, int len, char c) {
        if (str == null || str.length() == 0){
            str = "";
        }
        if (str.length() == len){
            return str;
        }
        if (str.length() > len){
            return str.substring(0,len);
        }
        StringBuilder sb = new StringBuilder(str);

        while (sb.length() < len){
            sb.append(c);
        }
        return sb.toString();
    }


}
