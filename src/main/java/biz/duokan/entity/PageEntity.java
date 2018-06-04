package biz.duokan.entity;

import java.util.List;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/10/21.
 */
public class PageEntity {

    private int num;
    private String name;
    private List<PageEntity> peList;
    private PageEntity parent;


    public PageEntity(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PageEntity> getPeList() {
        return peList;
    }

    public void setPeList(List<PageEntity> peList) {
        this.peList = peList;
    }

    public PageEntity getParent() {
        return parent;
    }

    public void setParent(PageEntity parent) {
        this.parent = parent;
    }
}
