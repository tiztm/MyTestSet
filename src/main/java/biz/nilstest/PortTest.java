package biz.nilstest;

import core.util.HTMLUtil;
import core.util.HttpclientUtil;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/11/30.
 */
public class PortTest {

    public static String ips = "10.15.0.90\n" +
            "61.160.137.200\n" +
            "61.160.137.201\n" +
            "61.160.137.229\n" +
            "61.160.137.230\n" +
            "61.160.137.231\n" +
            "61.160.137.232\n" +
            "61.160.137.233\n" +
            "61.160.137.234\n" +
            "61.160.137.235\n" +
            "61.160.185.222\n" +
            "61.160.185.223\n" +
            "61.160.185.224\n" +
            "61.160.185.225\n" +
            "61.160.185.226\n" +
            "61.160.185.227\n" +
            "132.228.41.176\n" +
            "192.168.1.115\n" +
            "192.168.53.159\n" +
            "192.168.53.160\n" +
            "192.168.53.161\n" +
            "192.168.53.162\n" +
            "192.168.53.163\n" +
            "192.168.53.164\n" +
            "192.168.53.165\n" +
            "192.168.53.166\n" +
            "192.168.53.167\n" +
            "192.168.53.168\n" +
            "192.168.53.169\n" +
            "192.168.53.170\n" +
            "192.168.53.171\n" +
            "192.168.58.86\n" +
            "192.168.58.87\n" +
            "192.168.58.88\n" +
            "192.168.58.89\n" +
            "192.168.58.90\n" +
            "192.168.116.148\n" +
            "192.168.116.149\n" +
            "192.168.116.150\n" +
            "192.168.116.151\n" +
            "192.168.197.33\n" +
            "192.168.197.34\n" +
            "192.168.197.35\n" +
            "192.168.197.36\n" +
            "192.168.197.37\n" +
            "192.168.197.38\n" +
            "192.168.197.39\n" +
            "192.168.197.40\n" +
            "192.168.197.41\n" +
            "192.168.197.42\n" +
            "192.168.197.43\n" +
            "192.168.197.44\n" +
            "192.168.197.45\n" +
            "192.168.197.46\n" +
            "192.168.197.47\n" +
            "192.168.197.48\n" +
            "192.168.197.49\n" +
            "192.168.197.50\n" +
            "192.168.197.51\n" +
            "192.168.197.52\n" +
            "192.168.197.53\n" +
            "192.168.197.54\n" +
            "192.168.197.55\n" +
            "192.168.197.56\n" +
            "192.168.197.57\n" +
            "192.168.197.58\n" +
            "192.168.197.59\n" +
            "192.168.197.60\n" +
            "192.168.197.61\n" +
            "192.168.197.62\n" +
            "192.168.197.63\n" +
            "192.168.197.64\n" +
            "192.168.197.65\n" +
            "192.168.197.67\n" +
            "202.102.101.11\n" +
            "202.102.101.22\n" +
            "202.102.101.26\n" +
            "202.102.101.27\n" +
            "202.102.101.28\n" +
            "202.102.101.39\n" +
            "202.102.101.40\n" +
            "202.102.101.41\n" +
            "202.102.101.46\n" +
            "202.102.101.47\n" +
            "202.102.101.50\n" +
            "202.102.101.51\n" +
            "202.102.101.52\n" +
            "202.102.101.54\n" +
            "202.102.101.77\n" +
            "202.102.101.92\n" +
            "202.102.101.93\n" +
            "202.102.101.110\n" +
            "202.102.101.111\n" +
            "202.102.101.130\n" +
            "202.102.101.136\n" +
            "202.102.101.137\n" +
            "202.102.101.151\n" +
            "202.102.101.162\n" +
            "202.102.101.163\n" +
            "202.102.101.186\n" +
            "202.102.108.2\n" +
            "202.102.108.3\n" +
            "202.102.108.14\n" +
            "202.102.108.15\n" +
            "202.102.108.18\n" +
            "202.102.108.20\n" +
            "202.102.108.21\n" +
            "202.102.108.28\n" +
            "202.102.108.35\n" +
            "202.102.108.36\n" +
            "202.102.108.51\n" +
            "202.102.108.52\n" +
            "202.102.108.53\n" +
            "202.102.108.168\n" +
            "202.102.108.169\n" +
            "202.102.108.170\n" +
            "202.102.108.171\n" +
            "202.102.108.173\n" +
            "202.102.108.175\n" +
            "202.102.108.176\n" +
            "202.102.108.177\n" +
            "202.102.108.190\n" +
            "202.102.112.163\n" +
            "202.102.112.167\n" +
            "202.102.112.171\n" +
            "202.102.112.172\n" +
            "202.111.54.116\n" +
            "221.228.17.116\n" +
            "221.228.17.117\n" +
            "202.102.112.164\n";

    public static void main(String[] args) {

        String[] split = ips.split("\n");


        for (int i = 0; i < split.length; i++) {


            String ip = split[i];

            if(ip.length()<1) continue;

           // String[] ipinfo = ip.split(":");
            if(ip.startsWith("192")||ip.startsWith("10")) continue;

            String realIp = ip;


            System.out.println( "nmap -open -sT -sV -Pn -max-rtt-timeout 300ms --host-timeout 900000ms -v -p1-65535 " +realIp+                    " >> nmapopen.txt");

            //anaHttp(ip);

        }

        System.out.println("my hack start");
    }

    public static void anaHttp(String realIp){
        try {
            String s = HttpclientUtil.get("http://" + realIp);

            s = s.replaceAll("\r","").replaceAll("\n","").replaceAll(" ","");

            String betweenString = HTMLUtil.getBetweenString(s, "<title>", "</title>"); //<title>鸿信天翼定位软件</title>
            //<title>综合办公－综合办公平台专家</title>



            System.out.print("发现服务："+realIp +" - ");

            if(betweenString.length()<1)
                System.out.println("复杂");//s);
            else
                System.out.println(betweenString);
        } catch (Exception e) {
           // e.printStackTrace();
        }

    }
}
