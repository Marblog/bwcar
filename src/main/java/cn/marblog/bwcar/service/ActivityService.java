package cn.marblog.bwcar.service;

import cn.marblog.bwcar.dto.ActivityDTO;
import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;

public interface ActivityService {

    public int addActivity(ActivityDTO activityDTO);

    public int delActivity(Long id);

    public int updateActivity(ActivityDTO activityDTO);

    public ActivityDTO findById(Long id);

    public DataGridResult findByPage(QueryDtO queryDTO);
}
