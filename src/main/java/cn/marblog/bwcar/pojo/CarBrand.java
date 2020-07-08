package cn.marblog.bwcar.pojo;

import java.io.Serializable;

public class CarBrand implements Serializable {
    private Integer id;

    private String name;

    private String otherName;

    private String englishName;

    private Integer countryId;

    private String logoUrl;

    private String logoMeaning;

    private String firstChar;

    private String spell;

    private String allSpell;

    private String nameSpell;

    private String nameAllSpell;

    private String introduction;

    private Byte saleStatus;

    private Byte isEnabled;

    private Byte isRemoved;

    private Long createTime;

    private Long updateTime;

    private Long doTime;

    private Long syncTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    public String getLogoMeaning() {
        return logoMeaning;
    }

    public void setLogoMeaning(String logoMeaning) {
        this.logoMeaning = logoMeaning == null ? null : logoMeaning.trim();
    }

    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar == null ? null : firstChar.trim();
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell == null ? null : spell.trim();
    }

    public String getAllSpell() {
        return allSpell;
    }

    public void setAllSpell(String allSpell) {
        this.allSpell = allSpell == null ? null : allSpell.trim();
    }

    public String getNameSpell() {
        return nameSpell;
    }

    public void setNameSpell(String nameSpell) {
        this.nameSpell = nameSpell == null ? null : nameSpell.trim();
    }

    public String getNameAllSpell() {
        return nameAllSpell;
    }

    public void setNameAllSpell(String nameAllSpell) {
        this.nameAllSpell = nameAllSpell == null ? null : nameAllSpell.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Byte getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Byte saleStatus) {
        this.saleStatus = saleStatus;
    }

    public Byte getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Byte isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Byte getIsRemoved() {
        return isRemoved;
    }

    public void setIsRemoved(Byte isRemoved) {
        this.isRemoved = isRemoved;
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

    public Long getDoTime() {
        return doTime;
    }

    public void setDoTime(Long doTime) {
        this.doTime = doTime;
    }

    public Long getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Long syncTime) {
        this.syncTime = syncTime;
    }
}