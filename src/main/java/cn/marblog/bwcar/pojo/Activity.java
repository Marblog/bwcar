package cn.marblog.bwcar.pojo;

import java.io.Serializable;

public class Activity implements Serializable {
    private Long id;

    private String title;

    private Integer categoryId;

    private String url;

    private Byte state;

    private String summary;

    private String link;

    private Long beginTime;

    private Long endTime;

    private Byte channelTop;

    private Byte homeTop;

    private Integer pvCount;

    private Integer uvCount;

    private Integer upCount;

    private Integer favCount;

    private Byte publishState;

    private Integer createUid;

    private Long createTime;

    private String author;

    private String unpublishUname;

    private Long unpublishTime;

    private String seoKeywords;

    private String sdkPath;

    private Integer likeCount;

    private Integer shareCount;

    private Integer viewCount;

    private String tags;

    private String coverPic;

    private String cars;

    private Integer sdkId;

    private String sdkTitle;

    private String dealer;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Byte getChannelTop() {
        return channelTop;
    }

    public void setChannelTop(Byte channelTop) {
        this.channelTop = channelTop;
    }

    public Byte getHomeTop() {
        return homeTop;
    }

    public void setHomeTop(Byte homeTop) {
        this.homeTop = homeTop;
    }

    public Integer getPvCount() {
        return pvCount;
    }

    public void setPvCount(Integer pvCount) {
        this.pvCount = pvCount;
    }

    public Integer getUvCount() {
        return uvCount;
    }

    public void setUvCount(Integer uvCount) {
        this.uvCount = uvCount;
    }

    public Integer getUpCount() {
        return upCount;
    }

    public void setUpCount(Integer upCount) {
        this.upCount = upCount;
    }

    public Integer getFavCount() {
        return favCount;
    }

    public void setFavCount(Integer favCount) {
        this.favCount = favCount;
    }

    public Byte getPublishState() {
        return publishState;
    }

    public void setPublishState(Byte publishState) {
        this.publishState = publishState;
    }

    public Integer getCreateUid() {
        return createUid;
    }

    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getUnpublishUname() {
        return unpublishUname;
    }

    public void setUnpublishUname(String unpublishUname) {
        this.unpublishUname = unpublishUname == null ? null : unpublishUname.trim();
    }

    public Long getUnpublishTime() {
        return unpublishTime;
    }

    public void setUnpublishTime(Long unpublishTime) {
        this.unpublishTime = unpublishTime;
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords == null ? null : seoKeywords.trim();
    }

    public String getSdkPath() {
        return sdkPath;
    }

    public void setSdkPath(String sdkPath) {
        this.sdkPath = sdkPath == null ? null : sdkPath.trim();
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getCoverPic() {
        return coverPic;
    }

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic == null ? null : coverPic.trim();
    }

    public String getCars() {
        return cars;
    }

    public void setCars(String cars) {
        this.cars = cars == null ? null : cars.trim();
    }

    public Integer getSdkId() {
        return sdkId;
    }

    public void setSdkId(Integer sdkId) {
        this.sdkId = sdkId;
    }

    public String getSdkTitle() {
        return sdkTitle;
    }

    public void setSdkTitle(String sdkTitle) {
        this.sdkTitle = sdkTitle == null ? null : sdkTitle.trim();
    }

    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer == null ? null : dealer.trim();
    }
}