package cn.marblog.bwcar.service;

import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.Tag;
import cn.marblog.bwcar.utils.R;

public interface TagService {
    int addTag(Tag tag);

    void delTag(Integer id);

    int updateTag(Tag tag);

    Tag findById(Integer id);

    DataGridResult findByPage(QueryDtO queryDtO);

    R findLineData();

    R findBarData();

    R findPieData();
}
