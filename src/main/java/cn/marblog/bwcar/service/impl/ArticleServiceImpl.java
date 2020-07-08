package cn.marblog.bwcar.service.impl;

import cn.marblog.bwcar.dao.ArticleMapper;
import cn.marblog.bwcar.dto.ArticleDTO;
import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.Article;
import cn.marblog.bwcar.pojo.ArticleExample;
import cn.marblog.bwcar.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    @Override
    public int addArticle(ArticleDTO articleDTO) {
        Article article = new Article();
        BeanUtils.copyProperties(articleDTO, article);
        Boolean allowUp = articleDTO.getAllowUp();
        if (allowUp) {
            article.setAllowUp((byte) 1);
        } else {
            article.setAllowUp((byte) 0);
        }
        Boolean allowFav = articleDTO.getAllowFav();
        if (allowFav) {
            article.setAllowFav((byte) 1);
        } else {
            article.setAllowFav((byte) 0);
        }

        return articleMapper.insertSelective(article);
    }

    @Override
    public void delArticle(Long id) {
        articleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateArticle(ArticleDTO articleDTO) {
        Article article = new Article();
        BeanUtils.copyProperties(articleDTO, article);
        Boolean allowUp = articleDTO.getAllowUp();
        if (allowUp) {
            article.setAllowUp((byte) 1);
        } else {
            article.setAllowUp((byte) 0);
        }
        Boolean allowFav = articleDTO.getAllowFav();
        if (allowFav) {
            article.setAllowFav((byte) 1);
        } else {
            article.setAllowFav((byte) 0);
        }

        return articleMapper.updateByPrimaryKeySelective(article);
    }

    @Override
    public Article findById(Long id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public DataGridResult findByPage(QueryDtO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());
        ArticleExample example = new ArticleExample();
        String sort = queryDTO.getSort();
        if(!StringUtils.isEmpty(sort)){
            example.setOrderByClause("id");
        }
        List<Article> articles = articleMapper.selectByExample(example);
        PageInfo<Article> info = new PageInfo<>(articles);
        long total = info.getTotal();
        return new DataGridResult(total,articles);
    }
}
