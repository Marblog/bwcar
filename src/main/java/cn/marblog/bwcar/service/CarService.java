package cn.marblog.bwcar.service;

import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.Car;

public interface CarService {
    int addCar(Car car);

    void delCar(Integer id);

    int updateCar(Car car);

    Car findById(Integer id);

    DataGridResult findByPage(QueryDtO queryDtO);
}
