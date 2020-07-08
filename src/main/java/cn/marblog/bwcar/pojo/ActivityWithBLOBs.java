package cn.marblog.bwcar.pojo;

import java.io.Serializable;

public class ActivityWithBLOBs extends Activity implements Serializable {
    private String description;

    private String seoDescription;

    private static final long serialVersionUID = 1L;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription == null ? null : seoDescription.trim();
    }
}