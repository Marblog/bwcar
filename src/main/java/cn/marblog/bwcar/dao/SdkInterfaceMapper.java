package cn.marblog.bwcar.dao;

import cn.marblog.bwcar.pojo.SdkInterface;
import cn.marblog.bwcar.pojo.SdkInterfaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdkInterfaceMapper {
    long countByExample(SdkInterfaceExample example);

    int deleteByExample(SdkInterfaceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SdkInterface record);

    int insertSelective(SdkInterface record);

    List<SdkInterface> selectByExample(SdkInterfaceExample example);

    SdkInterface selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SdkInterface record, @Param("example") SdkInterfaceExample example);

    int updateByExample(@Param("record") SdkInterface record, @Param("example") SdkInterfaceExample example);

    int updateByPrimaryKeySelective(SdkInterface record);

    int updateByPrimaryKey(SdkInterface record);
}