package cn.marblog.bwcar.service;

import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.CarMake;

import java.util.List;

public interface CarMakeService {
    int addCarMake(CarMake carMake);

    void delCarMake(Integer id);

    int updateCarMake(CarMake carMake);

    CarMake findById(Integer id);

    DataGridResult findByPage(QueryDtO queryDtO);

    List<CarMake> findAll();
}
