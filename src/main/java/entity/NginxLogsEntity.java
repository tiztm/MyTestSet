package entity;

/**
 * Created by nilszhang on 2016/2/17.
 */
public class NginxLogsEntity {

    @Override
    public String toString() {
        return logUrl+","+lastShow+","+allShowTime+","+showTime+","+allCostTime+","+allCostTime/showTime+","+(showTime+0.0)/allShowTime;
    }

    private String logUrl;

    private double allCostTime;

    private int showTime;

    private int allShowTime;

    private String lastShow;


    public String getLogUrl() {
        return logUrl;
    }

    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }

    public int getShowTime() {
        return showTime;
    }

    public void setShowTime(int showTime) {
        this.showTime = showTime;
    }

    public String getLastShow() {
        return lastShow;
    }

    public void setLastShow(String lastShow) {
        this.lastShow = lastShow;
    }

    public double getAllCostTime() {
        return allCostTime;
    }

    public void setAllCostTime(double allCostTime) {
        this.allCostTime = allCostTime;
    }

    public int getAllShowTime() {
        return allShowTime;
    }

    public void setAllShowTime(int allShowTime) {
        this.allShowTime = allShowTime;
    }
}
