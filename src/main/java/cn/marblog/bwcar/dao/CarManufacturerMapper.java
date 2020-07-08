package cn.marblog.bwcar.dao;

import cn.marblog.bwcar.pojo.CarManufacturer;
import cn.marblog.bwcar.pojo.CarManufacturerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarManufacturerMapper {
    long countByExample(CarManufacturerExample example);

    int deleteByExample(CarManufacturerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarManufacturer record);

    int insertSelective(CarManufacturer record);

    List<CarManufacturer> selectByExample(CarManufacturerExample example);

    CarManufacturer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarManufacturer record, @Param("example") CarManufacturerExample example);

    int updateByExample(@Param("record") CarManufacturer record, @Param("example") CarManufacturerExample example);

    int updateByPrimaryKeySelective(CarManufacturer record);

    int updateByPrimaryKey(CarManufacturer record);
}