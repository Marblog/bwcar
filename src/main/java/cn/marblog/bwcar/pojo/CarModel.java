package cn.marblog.bwcar.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class CarModel implements Serializable {
    private Integer id;

    private Integer brandId;

    private String brandName;

    private Integer makeId;

    private String makeName;

    private String name;

    private String displayName;

    private String otherName;

    private String englishName;

    private Integer countryClass;

    private String countryClassName;

    private Integer bodyForm;

    private String bodyFormName;

    private BigDecimal priceLow;

    private BigDecimal priceHigh;

    private Integer level;

    private String levelName;

    private Integer levelSecond;

    private String levelSecondName;

    private Byte saleStatus;

    private String allSpell;

    private Integer countryId;

    private String countryName;

    private Long createTime;

    private Long updateTime;

    private Long syncTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public Integer getMakeId() {
        return makeId;
    }

    public void setMakeId(Integer makeId) {
        this.makeId = makeId;
    }

    public String getMakeName() {
        return makeName;
    }

    public void setMakeName(String makeName) {
        this.makeName = makeName == null ? null : makeName.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName == null ? null : otherName.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public Integer getCountryClass() {
        return countryClass;
    }

    public void setCountryClass(Integer countryClass) {
        this.countryClass = countryClass;
    }

    public String getCountryClassName() {
        return countryClassName;
    }

    public void setCountryClassName(String countryClassName) {
        this.countryClassName = countryClassName == null ? null : countryClassName.trim();
    }

    public Integer getBodyForm() {
        return bodyForm;
    }

    public void setBodyForm(Integer bodyForm) {
        this.bodyForm = bodyForm;
    }

    public String getBodyFormName() {
        return bodyFormName;
    }

    public void setBodyFormName(String bodyFormName) {
        this.bodyFormName = bodyFormName == null ? null : bodyFormName.trim();
    }

    public BigDecimal getPriceLow() {
        return priceLow;
    }

    public void setPriceLow(BigDecimal priceLow) {
        this.priceLow = priceLow;
    }

    public BigDecimal getPriceHigh() {
        return priceHigh;
    }

    public void setPriceHigh(BigDecimal priceHigh) {
        this.priceHigh = priceHigh;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    public Integer getLevelSecond() {
        return levelSecond;
    }

    public void setLevelSecond(Integer levelSecond) {
        this.levelSecond = levelSecond;
    }

    public String getLevelSecondName() {
        return levelSecondName;
    }

    public void setLevelSecondName(String levelSecondName) {
        this.levelSecondName = levelSecondName == null ? null : levelSecondName.trim();
    }

    public Byte getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Byte saleStatus) {
        this.saleStatus = saleStatus;
    }

    public String getAllSpell() {
        return allSpell;
    }

    public void setAllSpell(String allSpell) {
        this.allSpell = allSpell == null ? null : allSpell.trim();
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Long getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Long syncTime) {
        this.syncTime = syncTime;
    }
}