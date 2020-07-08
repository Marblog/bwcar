package cn.marblog.bwcar.dao;

import cn.marblog.bwcar.pojo.ProductCar;
import cn.marblog.bwcar.pojo.ProductCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCarMapper {
    long countByExample(ProductCarExample example);

    int deleteByExample(ProductCarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductCar record);

    int insertSelective(ProductCar record);

    List<ProductCar> selectByExample(ProductCarExample example);

    ProductCar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductCar record, @Param("example") ProductCarExample example);

    int updateByExample(@Param("record") ProductCar record, @Param("example") ProductCarExample example);

    int updateByPrimaryKeySelective(ProductCar record);

    int updateByPrimaryKey(ProductCar record);
}