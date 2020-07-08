package cn.marblog.bwcar.dao;

import cn.marblog.bwcar.pojo.MemberLoginLog;
import cn.marblog.bwcar.pojo.MemberLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberLoginLogMapper {
    long countByExample(MemberLoginLogExample example);

    int deleteByExample(MemberLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberLoginLog record);

    int insertSelective(MemberLoginLog record);

    List<MemberLoginLog> selectByExample(MemberLoginLogExample example);

    MemberLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberLoginLog record, @Param("example") MemberLoginLogExample example);

    int updateByExample(@Param("record") MemberLoginLog record, @Param("example") MemberLoginLogExample example);

    int updateByPrimaryKeySelective(MemberLoginLog record);

    int updateByPrimaryKey(MemberLoginLog record);
}