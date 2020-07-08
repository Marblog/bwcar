package cn.marblog.bwcar.controller;

import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.Tag;
import cn.marblog.bwcar.service.TagService;
import cn.marblog.bwcar.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TagController {
    @Autowired
    TagService tagService;


    @RequestMapping("/sys/tag/list")
    public DataGridResult findTag(QueryDtO queryDtO) {
        return tagService.findByPage(queryDtO);
    }

    @RequestMapping("/sys/tag/del")
    public R deleteTag(@RequestBody List<Integer> ids) {
        for (Integer id : ids) {
            tagService.delTag(id);
        }
        return R.ok();
    }

    @RequestMapping("/sys/tag/save")
    public R saveTag(@RequestBody Tag tag) {
        int i = tagService.addTag(tag);
        return i > 0 ? R.ok() : R.error("添加失败");
    }

    @RequestMapping("/sys/tag/info/{id}")
    public R findById(@PathVariable("id") Integer id) {
        Tag byId = tagService.findById(id);
        return R.ok().put("tag", byId);
    }

    @RequestMapping("/sys/tag/update")
    public R updateTag(@RequestBody Tag tag) {
        int i = tagService.updateTag(tag);
        return i > 0 ? R.ok() : R.error("更新失败");
    }

    //----标签折线图-----
    @RequestMapping("/sys/echarts/line")
    public R findLine() {
        return tagService.findLineData();
    }

    @RequestMapping("/sys/echarts/bar")
    public R findBar() {
        return tagService.findBarData();
    }

    @RequestMapping("/sys/echarts/pie")
    public R findPie() {
        return tagService.findPieData();
    }
}
