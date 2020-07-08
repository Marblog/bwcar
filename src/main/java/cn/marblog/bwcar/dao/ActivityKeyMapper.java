package cn.marblog.bwcar.dao;

import cn.marblog.bwcar.pojo.ActivityKey;
import cn.marblog.bwcar.pojo.ActivityKeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityKeyMapper {
    long countByExample(ActivityKeyExample example);

    int deleteByExample(ActivityKeyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityKey record);

    int insertSelective(ActivityKey record);

    List<ActivityKey> selectByExample(ActivityKeyExample example);

    ActivityKey selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityKey record, @Param("example") ActivityKeyExample example);

    int updateByExample(@Param("record") ActivityKey record, @Param("example") ActivityKeyExample example);

    int updateByPrimaryKeySelective(ActivityKey record);

    int updateByPrimaryKey(ActivityKey record);
}