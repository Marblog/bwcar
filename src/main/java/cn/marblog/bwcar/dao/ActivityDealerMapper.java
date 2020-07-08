package cn.marblog.bwcar.dao;

import cn.marblog.bwcar.pojo.ActivityDealer;
import cn.marblog.bwcar.pojo.ActivityDealerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityDealerMapper {
    long countByExample(ActivityDealerExample example);

    int deleteByExample(ActivityDealerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityDealer record);

    int insertSelective(ActivityDealer record);

    List<ActivityDealer> selectByExample(ActivityDealerExample example);

    ActivityDealer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityDealer record, @Param("example") ActivityDealerExample example);

    int updateByExample(@Param("record") ActivityDealer record, @Param("example") ActivityDealerExample example);

    int updateByPrimaryKeySelective(ActivityDealer record);

    int updateByPrimaryKey(ActivityDealer record);
}