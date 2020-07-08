package cn.marblog.bwcar.dto;

import cn.marblog.bwcar.pojo.Article;
import cn.marblog.bwcar.service.ArticleService;
import cn.marblog.bwcar.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
public class ArticleController {
    @Autowired
    ArticleService articleService;


    @RequestMapping("/sys/article/list")
    public DataGridResult findArtTitle(QueryDtO queryDtO) {
        return articleService.findByPage(queryDtO);
    }

    @RequestMapping("/sys/article/del")
    public R delArticle(@RequestBody List<Long> ids) {
        for (Long id : ids) {
            articleService.delArticle(id);
        }
        return R.ok();
    }

    @RequestMapping("/sys/article/info/{id}")
    public R findById(@PathVariable("id") Long id) {
        Article byId = articleService.findById(id);
        return R.ok().put("article", byId);
    }

    @RequestMapping("/sys/article/save")
    public R addArticle(@RequestBody ArticleDTO articleDTO) {
        int i = articleService.addArticle(articleDTO);
        return i > 0 ? R.ok() : R.error("添加失败");
    }

    @RequestMapping("/sys/article/update")
    public R updateArticle(@RequestBody ArticleDTO articleDTO) {
        int i = articleService.updateArticle(articleDTO);
        return i > 0 ? R.ok() : R.error("更新失败");
    }

    @RequestMapping("/ytupload")
    public R upload(@RequestParam("mypic") MultipartFile multipartFile) throws IOException {
        String filename = multipartFile.getOriginalFilename();
        File dest = new File("F:\\dest" + filename);
        multipartFile.transferTo(dest);
        return R.ok().put("file", filename);
    }
}
