package biz.shengweiexam;

import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelEntity;
import org.jeecgframework.poi.excel.annotation.ExcelTarget;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/10/9.
 */

@ExcelTarget("deptEntity")
public class deptEntity implements java.io.Serializable {

    /**
     * 课程名称
     */
    @Excel(name = "单位", orderNum = "1")
    private String name;

    /**
     * 课程名称
     */
    @Excel(name = "验证码", orderNum = "2")
    private String valid;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }
}