package cn.marblog.bwcar.pojo;

import java.io.Serializable;

public class ProductWithBLOBs extends Product implements Serializable {
    private String description;

    private String service;

    private static final long serialVersionUID = 1L;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service == null ? null : service.trim();
    }
}