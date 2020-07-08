package cn.marblog.bwcar.pojo;

import java.io.Serializable;

public class ActivityDealer implements Serializable {
    private Integer id;

    private Integer activityId;

    private Integer dealerId;

    private String dealerProvince;

    private String dealerCity;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerProvince() {
        return dealerProvince;
    }

    public void setDealerProvince(String dealerProvince) {
        this.dealerProvince = dealerProvince == null ? null : dealerProvince.trim();
    }

    public String getDealerCity() {
        return dealerCity;
    }

    public void setDealerCity(String dealerCity) {
        this.dealerCity = dealerCity == null ? null : dealerCity.trim();
    }
}