package cn.marblog.bwcar.service;

import cn.marblog.bwcar.dto.ArticleDTO;
import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.Article;


public interface ArticleService {
    int addArticle(ArticleDTO articleDTO);

    void delArticle(Long id);

    int updateArticle(ArticleDTO articleDTO);

    Article findById(Long id);

    DataGridResult findByPage(QueryDtO queryDtO);
}
