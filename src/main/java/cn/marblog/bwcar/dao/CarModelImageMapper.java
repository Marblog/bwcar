package cn.marblog.bwcar.dao;

import cn.marblog.bwcar.pojo.CarModelImage;
import cn.marblog.bwcar.pojo.CarModelImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarModelImageMapper {
    long countByExample(CarModelImageExample example);

    int deleteByExample(CarModelImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarModelImage record);

    int insertSelective(CarModelImage record);

    List<CarModelImage> selectByExample(CarModelImageExample example);

    CarModelImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarModelImage record, @Param("example") CarModelImageExample example);

    int updateByExample(@Param("record") CarModelImage record, @Param("example") CarModelImageExample example);

    int updateByPrimaryKeySelective(CarModelImage record);

    int updateByPrimaryKey(CarModelImage record);
}