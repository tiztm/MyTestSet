package biz.nilstest.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2018/7/23.
 */
public class NginxEntity {


    private static SimpleDateFormat zzytsdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    private Date logTime;
    private String url;
    private String param;
    private String rtnCode;
    private String length;
    private String reffer;
    private String clientIP;
    private String serverIP;
    private String serverRtnCode;
    private String allRespoTime;
    private String servletRespoTime;


    @Override
    public String toString()
    {
        return zzytsdf.format(logTime)+";"+url+";"+param+";"+rtnCode+";"+length+";"+reffer+";"+clientIP+";"+serverIP+";"+serverRtnCode;
    }


    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(String rtnCode) {
        this.rtnCode = rtnCode;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getReffer() {
        return reffer;
    }

    public void setReffer(String reffer) {
        this.reffer = reffer;
    }

    public String getClientIP() {
        return clientIP;
    }

    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }

    public String getServerIP() {
        return serverIP;
    }

    public void setServerIP(String serverIP) {
        this.serverIP = serverIP;
    }

    public String getServerRtnCode() {
        return serverRtnCode;
    }

    public void setServerRtnCode(String serverRtnCode) {
        this.serverRtnCode = serverRtnCode;
    }

    public String getAllRespoTime() {
        return allRespoTime;
    }

    public void setAllRespoTime(String allRespoTime) {
        this.allRespoTime = allRespoTime;
    }

    public String getServletRespoTime() {
        return servletRespoTime;
    }

    public void setServletRespoTime(String servletRespoTime) {
        this.servletRespoTime = servletRespoTime;
    }
}
