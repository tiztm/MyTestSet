package biz.nilstest;

import biz.nilstest.entity.NginxEntity;
import biz.nilstest.entity.NginxLogsEntity;
import core.util.DateSpanUtil;
import core.util.DateUtil;
import core.util.HTMLUtil;

import java.io.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

/**
 * 为天阙的Nginx日志准备，只适配如下的Nginx日志格式
 *
 * log_format  main  '$http_x_forwarded_for - $remote_user [$time_iso8601] "$request" '
                        '$status $body_bytes_sent "$http_referer" '
                        '"$http_user_agent" "$remote_addr" "$upstream_addr $upstream_status" "$request_time" "$upstream_response_time"';
 *
 *
 */
public class NginxLogsAnaZZYT {




    private static final String log201Path ="201/access.log";
    //private static final String log201Path ="D://access20180819.log";


    private static final String log202Path ="202/access.log";


    static DateSpanUtil dsu = new DateSpanUtil();

    private static int logLength = 8;

    private static SimpleDateFormat zzytsdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    static final String createNginxLogSQL = "CREATE TABLE \"NGINX_LOG\" (\n" +
            "\"ROW_ID\" NUMBER(10) NOT NULL ,\n" +
            "\"LOGON_TIME\" TIMESTAMP NULL ,\n" +
            "\"URL\" VARCHAR2(2550 BYTE) NULL ,\n" +
            "\"PARAM\" VARCHAR2(2550 BYTE) NULL ,\n" +
            "\"RTN_CODE\" VARCHAR2(255 BYTE) NULL ,\n" +
            "\"LENGTH\" NUMBER(10) NULL ,\n" +
            "\"REFFER\" VARCHAR2(2550 BYTE) NULL ,\n" +
            "\"CLIENT_IP\" VARCHAR2(255 BYTE) NULL ,\n" +
            "\"SERVER_IP\" VARCHAR2(2550 BYTE) NULL ,\n" +
            "\"SERVER_RTN_CODE\" VARCHAR2(255 BYTE) NULL, \n" +
            "\"ALL_RESPO_TIME\" NUMBER(10,5) NULL, \n" +
            "\"SERVLET_RESPO_TIME\" NUMBER(10,5) NULL \n" +
            ")";




    public static void main(String[] args) throws Exception {



        File f = new File(log201Path);

        readFileByLines(f,"log201");


        File f2 = new File(log202Path);

        readFileByLines(f2,"log202");

    }


    public static String getFixedLenString(String str, int len) {
        if (str == null || str.length() == 0){
            str = "";
        }

        if (str.length() > len){
            return str.substring(0,len);
        }

        return str;
    }



    /**
     * 检查传入信息的总耗时情况
     * @param str
     */
    public static NginxEntity anaAllCost(String str) {

        String[] split = str.split(" \"");

        NginxEntity ne = new NginxEntity();


        if (split.length == logLength) {

            int i=0;
            for (String s:split) {

                i++;

                if (i == 1) {
                    String substring = s.substring(7, s.length() - 7);
                    substring = substring.replaceAll("T"," ");
                    Date parse = null;
                    try {
                          parse = zzytsdf.parse(substring);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    ne.setLogTime(parse);

                }else
                if (i == 2) {
                    //分割地址与返回
                    String[] split1 = s.split(" ");
                    int j = 0;
                    for (String s1 : split1) {
                       // System.out.println(s1);

                        if (j == 1) {

                            String[] split2 = s1.split("\\?");

                            ne.setUrl(split2[0]);
                            if(split2.length>1) {
                                ne.setParam(split2[1]);
                            }

                        } else if (j == 3) {
                            ne.setRtnCode(s1);

                        } else if (j == 4) {
                            ne.setLength(s1);
                        }

                        j++;


                    }
                } else if (i == 3) {
                    ne.setReffer(s.substring(0,s.length()-1));
                } else if (i == 5) {
                    ne.setClientIP(s.substring(0,s.length()-1));
                } else if (i == 6) {

                    //分割地址与返回
                    String[] split1 = s.split(" ");

                    if(split1.length!=2)
                    {
                        ne.setServerIP(s);
                    }

                    int j = 0;
                    for (String s1 : split1) {
                        if (j == 0) {
                            ne.setServerIP(s1.replaceAll(",",""));
                        } else if (j == 1) {
                            ne.setServerRtnCode(s1.substring(0,s1.length()-1));
                        }
                        j++;

                    }


                } else if (i == 7) {
                    ne.setAllRespoTime(s.substring(0,s.length()-1));
                } else if (i == 8) {

                    String time = s.substring(0,s.length()-1);
                    if(time==null|| time.equals("-")||time.contains(","))
                    {
                        ne.setServletRespoTime("-0.0001");
                    }
                    else {
                        ne.setServletRespoTime(time);
                    }
                }
            } }

      return  ne;

    }



    static String batchSql = "";
    public static void readFileByLines(File f,String dbName) {
        File file = f;
        BufferedReader reader = null;




        try {


            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.
                    getConnection("jdbc:h2:tcp://localhost/mem:" +dbName+
                            ";DB_CLOSE_DELAY=-1", "sa", "");

            Statement stmt = conn.createStatement();

            try {
                stmt.executeUpdate("DROP TABLE \"NGINX_LOG\";");
            } catch (SQLException e) {
                e.printStackTrace();
            }

            stmt.executeUpdate(createNginxLogSQL);

            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            while ((tempString = reader.readLine()) != null) {

                NginxEntity nginxEntity = anaAllCost(tempString);
                if(nginxEntity.getUrl()==null) continue;

                try {
                    String sql = "INSERT INTO \"NGINX_LOG\" VALUES (" + line +
                            ", TO_DATE('" + zzytsdf.format(nginxEntity.getLogTime()) +
                            "', 'YYYY-MM-DD HH24:MI:SS'), '" + nginxEntity.getUrl() +
                            "', '" + (nginxEntity.getParam() == null ? "" : getFixedLenString(nginxEntity.getParam().replaceAll("'", ""),2550)) +
                            "', '" + nginxEntity.getRtnCode() +
                            "', '" + (nginxEntity.getLength() == null ? 0 : nginxEntity.getLength()) +
                            "', '" + nginxEntity.getReffer() +
                            "', '" + nginxEntity.getClientIP() +
                            "', '" + nginxEntity.getServerIP() +
                            "', '" + nginxEntity.getServerRtnCode() +
                            "', '" + nginxEntity.getAllRespoTime() +
                            "', '" + nginxEntity.getServletRespoTime() +
                            "');\n";

                    stmt.execute(sql);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(tempString);
                }


                if(line % 100000 == 0)
                {
                    dsu.getSpanDate();
                    System.out.println(line+":"+tempString);
                }

                line++;
            }

            conn.close();

            reader.close();
        } catch (Exception e) {
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
