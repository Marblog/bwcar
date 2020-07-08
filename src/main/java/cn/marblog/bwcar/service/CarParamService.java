package cn.marblog.bwcar.service;

import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.CarParams;

public interface CarParamService {
    int addCarParam(CarParams carParams);

    void delCarParam(Integer id);

    int updateCarParam(CarParams carParams);

    CarParams findById(Integer id);

    DataGridResult findByPage(QueryDtO queryDtO);
}
