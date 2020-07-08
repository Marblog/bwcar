package cn.marblog.bwcar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDTO {
    private Long id;
    private String title;
    private String source;
    private String summary;
    private String author;
    private String coverPic;
    private String tags;
    private String createTime;
    private String content;
    private Boolean allowUp;
    private Boolean allowFav;
}
