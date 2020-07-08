package cn.marblog.bwcar.pojo;

import java.io.Serializable;

public class DictAnswer implements Serializable {
    private Integer id;

    private Integer weightId;

    private String name;

    private String enName;

    private Integer adjustValue;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWeightId() {
        return weightId;
    }

    public void setWeightId(Integer weightId) {
        this.weightId = weightId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public Integer getAdjustValue() {
        return adjustValue;
    }

    public void setAdjustValue(Integer adjustValue) {
        this.adjustValue = adjustValue;
    }
}