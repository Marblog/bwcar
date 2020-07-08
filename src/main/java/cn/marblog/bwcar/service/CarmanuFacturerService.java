package cn.marblog.bwcar.service;


import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.CarManufacturer;

public interface CarmanuFacturerService {

    public int addCarmanuFacturer(CarManufacturer carManufacturer);

    public void delCarManu(Integer id);

    public int updateCarmanuFacturer(CarManufacturer carManufacturer);

    public CarManufacturer findById(Integer id);

    public DataGridResult findByPage(QueryDtO queryDTO);

}
