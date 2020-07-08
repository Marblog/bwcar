package cn.marblog.bwcar.service;

import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.CarModel;

public interface CarModelService {

    int addCarModel(CarModel carModel);

    void delCarModel(Integer id);

    int updateCarModel(CarModel carModel);

    CarModel findById(Integer id);

    DataGridResult findByPage(QueryDtO queryDtO);

}
