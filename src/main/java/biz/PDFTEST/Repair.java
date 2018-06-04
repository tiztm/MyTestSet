package biz.PDFTEST;


import java.util.Date;

/**
 * Created by Administrator on 2016/11/24.
 */
public class Repair  {

    private String id;

    private String name;
    private String title;
    private String cont;
    private String num;
    private String tel;

    private Date addTime;


    // 是否需要硬件
    // 0 不需要  1 需要
    private String needHardWare;

    //维修结果反馈
    private String result;

    public Repair(String name, String title, String num, String tel, String needHardWare) {
        this.name = name;
        this.title = title;
        this.num = num;
        this.tel = tel;
        this.needHardWare = needHardWare;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getNeedHardWare() {
        return needHardWare;
    }

    public void setNeedHardWare(String needHardWare) {
        this.needHardWare = needHardWare;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
