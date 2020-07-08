package cn.marblog.bwcar.service.impl;

import cn.marblog.bwcar.dao.TagMapper;
import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.Tag;
import cn.marblog.bwcar.pojo.TagExample;
import cn.marblog.bwcar.service.TagService;
import cn.marblog.bwcar.utils.R;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    TagMapper tagMapper;

    @Override
    public int addTag(Tag tag) {
        return tagMapper.insertSelective(tag);
    }

    @Override
    public void delTag(Integer id) {
        tagMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateTag(Tag tag) {

        return tagMapper.updateByPrimaryKeySelective(tag);
    }

    @Override
    public Tag findById(Integer id) {
        return tagMapper.selectByPrimaryKey(id);
    }

    @Override
    public DataGridResult findByPage(QueryDtO queryDtO) {
        PageHelper.offsetPage(queryDtO.getOffset(), queryDtO.getLimit());

        TagExample example = new TagExample();
        if (queryDtO.getSort() != null && !"".equals(queryDtO.getSort())) {
            example.setOrderByClause("id" + queryDtO.getOrder());
        }
        List<Tag> tags = tagMapper.selectByExample(example);
        PageInfo<Tag> info = new PageInfo<>(tags);
        long total = info.getTotal();
        return new DataGridResult(total, tags);

    }

    @Override
    public R findLineData() {
        List<String> XData = new ArrayList<>();
        ArrayList seriesData = new ArrayList();
        List<Tag> tags = tagMapper.selectByExample(null);

        for (Tag tag : tags) {
            String name = tag.getName();
            XData.add(name);
            Long clickCount = tag.getClickCount();
            seriesData.add(clickCount);
        }
        return R.ok().put("xAxis", XData).put("seriesData", seriesData);
    }

    @Override
    public R findBarData() {
        List<String> xAxis = new ArrayList<>();
        ArrayList series = new ArrayList();
        List<Tag> tags = tagMapper.selectByExample(null);
        for (Tag tag : tags) {
            xAxis.add(tag.getName());
            series.add(tag.getClickCount());
        }
        return R.ok().put("xAxis", xAxis).put("seriesData", series);
    }

    @Override
    public R findPieData() {
        List<String> legendData = new ArrayList<>();
        List<Map<String, Object>> seriesData = new ArrayList<>();
        List<Tag> tags = tagMapper.selectByExample(null);
        for (Tag tag : tags) {
            String name = tag.getName();
            Long clickCount = tag.getClickCount();
            legendData.add(name);
            Map<String, Object> map = new HashMap<>();
            map.put("name", name);
            map.put("value", clickCount);
            seriesData.add(map);
        }
        return R.ok().put("legendData", legendData).put("seriesData", seriesData);
    }
}
