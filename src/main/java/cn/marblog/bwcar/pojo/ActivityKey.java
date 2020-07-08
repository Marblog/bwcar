package cn.marblog.bwcar.pojo;

import java.io.Serializable;

public class ActivityKey implements Serializable {
    private Integer id;

    private Integer activityId;

    private Long createTime;

    private String actKey;

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

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getActKey() {
        return actKey;
    }

    public void setActKey(String actKey) {
        this.actKey = actKey == null ? null : actKey.trim();
    }
}