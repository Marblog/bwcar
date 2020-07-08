package cn.marblog.bwcar.pojo;

import java.io.Serializable;

public class ChooseLog implements Serializable {
    private Integer id;

    private String memberId;

    private Byte userCountry;

    private String userSpace;

    private String userPower;

    private String userComfort;

    private String userSafe;

    private String userCost;

    private String userMin;

    private String userMax;

    private String userPtime;

    private String userCar;

    private String chooseCar;

    private Long createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public Byte getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(Byte userCountry) {
        this.userCountry = userCountry;
    }

    public String getUserSpace() {
        return userSpace;
    }

    public void setUserSpace(String userSpace) {
        this.userSpace = userSpace == null ? null : userSpace.trim();
    }

    public String getUserPower() {
        return userPower;
    }

    public void setUserPower(String userPower) {
        this.userPower = userPower == null ? null : userPower.trim();
    }

    public String getUserComfort() {
        return userComfort;
    }

    public void setUserComfort(String userComfort) {
        this.userComfort = userComfort == null ? null : userComfort.trim();
    }

    public String getUserSafe() {
        return userSafe;
    }

    public void setUserSafe(String userSafe) {
        this.userSafe = userSafe == null ? null : userSafe.trim();
    }

    public String getUserCost() {
        return userCost;
    }

    public void setUserCost(String userCost) {
        this.userCost = userCost == null ? null : userCost.trim();
    }

    public String getUserMin() {
        return userMin;
    }

    public void setUserMin(String userMin) {
        this.userMin = userMin == null ? null : userMin.trim();
    }

    public String getUserMax() {
        return userMax;
    }

    public void setUserMax(String userMax) {
        this.userMax = userMax == null ? null : userMax.trim();
    }

    public String getUserPtime() {
        return userPtime;
    }

    public void setUserPtime(String userPtime) {
        this.userPtime = userPtime == null ? null : userPtime.trim();
    }

    public String getUserCar() {
        return userCar;
    }

    public void setUserCar(String userCar) {
        this.userCar = userCar == null ? null : userCar.trim();
    }

    public String getChooseCar() {
        return chooseCar;
    }

    public void setChooseCar(String chooseCar) {
        this.chooseCar = chooseCar == null ? null : chooseCar.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}