package biz.nilstest.entity;

import java.util.Date;

/**
 * Created by nilszhang on 2016/3/1.
 */
public class MybatisLogsEntity {


    @Override
    public String toString() {
        return sqlName+",\""+sql+"\",\""+sqlParam+"\","+heavyAllCostTime+","+heavyCount+","+heavyAllCostTime/heavyCount;
    }

    public MybatisLogsEntity(String sqlName, String sql, Date beginDate) {
        this.sqlName = sqlName;
        this.sql = sql;
        this.beginDate = beginDate;
    }

    public String getSqlName() {
        return sqlName;
    }

    public void setSqlName(String sqlName) {
        this.sqlName = sqlName;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getSqlParam() {
        return sqlParam;
    }

    public void setSqlParam(String sqlParam) {
        this.sqlParam = sqlParam;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getHeavyCount() {
        return heavyCount;
    }

    public void setHeavyCount(Integer heavyCount) {
        this.heavyCount = heavyCount;
    }

    public Long getHeavyAllCostTime() {
        return heavyAllCostTime;
    }

    public void setHeavyAllCostTime(Long heavyAllCostTime) {
        this.heavyAllCostTime = heavyAllCostTime;
    }

    private String sqlName;
    private String sql;
    private String sqlParam;
    private Integer count;
    private Integer heavyCount;
    private Long heavyAllCostTime;
    private Date beginDate;


    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }
}
