package cn.marblog.bwcar.service;

import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.CarParamType;

import java.util.List;

public interface CarParamTypeService {

    int addCarParamType(CarParamType carParamType);

    void delCarParamType(Integer id);

    int updateCarParamType(CarParamType carParamType);

    CarParamType findById(Integer id);

    List<CarParamType> findAll();

    DataGridResult findByPage(QueryDtO queryDtO);
}
