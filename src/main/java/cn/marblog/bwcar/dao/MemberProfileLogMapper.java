package cn.marblog.bwcar.dao;

import cn.marblog.bwcar.pojo.MemberProfileLog;
import cn.marblog.bwcar.pojo.MemberProfileLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberProfileLogMapper {
    long countByExample(MemberProfileLogExample example);

    int deleteByExample(MemberProfileLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberProfileLog record);

    int insertSelective(MemberProfileLog record);

    List<MemberProfileLog> selectByExample(MemberProfileLogExample example);

    MemberProfileLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberProfileLog record, @Param("example") MemberProfileLogExample example);

    int updateByExample(@Param("record") MemberProfileLog record, @Param("example") MemberProfileLogExample example);

    int updateByPrimaryKeySelective(MemberProfileLog record);

    int updateByPrimaryKey(MemberProfileLog record);
}