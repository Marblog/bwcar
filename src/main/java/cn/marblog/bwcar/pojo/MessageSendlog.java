package cn.marblog.bwcar.pojo;

import java.io.Serializable;

public class MessageSendlog implements Serializable {
    private Long id;

    private Long messageId;

    private Long sendTime;

    private Long toMid;

    private Integer received;

    private Long receiveTime;

    private Byte viewed;

    private Long viewTime;

    private Byte viewDetail;

    private Long viewDetailTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public Long getSendTime() {
        return sendTime;
    }

    public void setSendTime(Long sendTime) {
        this.sendTime = sendTime;
    }

    public Long getToMid() {
        return toMid;
    }

    public void setToMid(Long toMid) {
        this.toMid = toMid;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Long getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Long receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Byte getViewed() {
        return viewed;
    }

    public void setViewed(Byte viewed) {
        this.viewed = viewed;
    }

    public Long getViewTime() {
        return viewTime;
    }

    public void setViewTime(Long viewTime) {
        this.viewTime = viewTime;
    }

    public Byte getViewDetail() {
        return viewDetail;
    }

    public void setViewDetail(Byte viewDetail) {
        this.viewDetail = viewDetail;
    }

    public Long getViewDetailTime() {
        return viewDetailTime;
    }

    public void setViewDetailTime(Long viewDetailTime) {
        this.viewDetailTime = viewDetailTime;
    }
}