package cn.marblog.bwcar.service.impl;

import cn.marblog.bwcar.dao.ActivityMapper;
import cn.marblog.bwcar.dto.ActivityDTO;
import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.ActivityExample;
import cn.marblog.bwcar.pojo.ActivityWithBLOBs;
import cn.marblog.bwcar.service.ActivityService;
import cn.marblog.bwcar.utils.DateUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    ActivityMapper activityMapper;

    @Override
    public int addActivity(ActivityDTO activityDTO) {
        ActivityWithBLOBs record = getactivitywithblobs(activityDTO);
        return activityMapper.insertSelective(record);
    }

    @Override
    public int delActivity(Long id) {
        return activityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateActivity(ActivityDTO activityDTO) {
        ActivityWithBLOBs record = getactivitywithblobs(activityDTO);
        return activityMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public ActivityDTO findById(Long id) {
        ActivityWithBLOBs activityWithBLOBs = activityMapper.selectByPrimaryKey(id);
        ActivityDTO activityDTO = new ActivityDTO();
        BeanUtils.copyProperties(activityWithBLOBs, activityDTO);
        activityDTO.setBeginTime(DateUtils.longToStr(activityWithBLOBs.getBeginTime()));
        activityDTO.setEndTime(DateUtils.longToStr(activityWithBLOBs.getEndTime()));
        return activityDTO;

    }

    @Override
    public DataGridResult findByPage(QueryDtO queryDTO) {
        List<ActivityDTO> list = new ArrayList<>();
        PageHelper.offsetPage(queryDTO.getOffset(), queryDTO.getLimit());
        ActivityExample example = new ActivityExample();
        String sort = queryDTO.getSort();
        if (!StringUtils.isEmpty(sort)) {
            example.setOrderByClause("id");
        }
        List<ActivityWithBLOBs> bsList = activityMapper.selectByExampleWithBLOBs(example);
        for (ActivityWithBLOBs bloBs : bsList) {
            ActivityDTO activityDTO = new ActivityDTO();
            BeanUtils.copyProperties(bloBs, activityDTO);
            activityDTO.setBeginTime(DateUtils.longToStr(bloBs.getBeginTime()));
            activityDTO.setEndTime(DateUtils.longToStr(bloBs.getEndTime()));
            list.add(activityDTO);
        }//解决时间问题
        PageInfo<ActivityWithBLOBs> info = new PageInfo<>(bsList);
        long total = info.getTotal();
        return new DataGridResult(total, list);
    }



    private ActivityWithBLOBs getactivitywithblobs(ActivityDTO activityDTO) {
        ActivityWithBLOBs record = new ActivityWithBLOBs();
        BeanUtils.copyProperties(activityDTO, record);
        //解决字段不一致的问题
        try {
            Long beginTime = DateUtils.strToLong(activityDTO.getBeginTime());
            Long endTime = DateUtils.strToLong(activityDTO.getEndTime());
            record.setBeginTime(beginTime);
            record.setEndTime(endTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return record;
    }
}
