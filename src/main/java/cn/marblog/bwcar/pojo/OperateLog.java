package cn.marblog.bwcar.pojo;

import java.io.Serializable;

public class OperateLog implements Serializable {
    private Long id;

    private Integer operateTime;

    private Integer operateUid;

    private String tableName;

    private String tableDisname;

    private Long dataId;

    private String operateDesc;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Integer operateTime) {
        this.operateTime = operateTime;
    }

    public Integer getOperateUid() {
        return operateUid;
    }

    public void setOperateUid(Integer operateUid) {
        this.operateUid = operateUid;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getTableDisname() {
        return tableDisname;
    }

    public void setTableDisname(String tableDisname) {
        this.tableDisname = tableDisname == null ? null : tableDisname.trim();
    }

    public Long getDataId() {
        return dataId;
    }

    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    public String getOperateDesc() {
        return operateDesc;
    }

    public void setOperateDesc(String operateDesc) {
        this.operateDesc = operateDesc == null ? null : operateDesc.trim();
    }
}