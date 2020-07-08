package cn.marblog.bwcar.dao;

import cn.marblog.bwcar.pojo.CarParamType;
import cn.marblog.bwcar.pojo.CarParamTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarParamTypeMapper {
    long countByExample(CarParamTypeExample example);

    int deleteByExample(CarParamTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarParamType record);

    int insertSelective(CarParamType record);

    List<CarParamType> selectByExample(CarParamTypeExample example);

    CarParamType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarParamType record, @Param("example") CarParamTypeExample example);

    int updateByExample(@Param("record") CarParamType record, @Param("example") CarParamTypeExample example);

    int updateByPrimaryKeySelective(CarParamType record);

    int updateByPrimaryKey(CarParamType record);
}