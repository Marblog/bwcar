package cn.marblog.bwcar.dto;

import lombok.Data;

@Data
public class ActivityDTO {
    private Long id;

    private String title;

    private Integer categoryId;

    private String url;

    private Byte state;

    private String summary;

    private String link;

    private String beginTime;

    private String endTime;

    private Byte channelTop;

    private Byte homeTop;

    private Integer pvCount;

    private Integer uvCount;

    private Integer upCount;

    private Integer favCount;

    private Byte publishState;

    private Integer createUid;

    private Integer createTime;

    private String author;

    private String unpublishUname;

    private String unpublishTime;

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
    private String description;

    private String seoDescription;
}
