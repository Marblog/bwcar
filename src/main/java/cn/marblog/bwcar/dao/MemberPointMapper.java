package cn.marblog.bwcar.dao;

import cn.marblog.bwcar.pojo.MemberPoint;
import cn.marblog.bwcar.pojo.MemberPointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberPointMapper {
    long countByExample(MemberPointExample example);

    int deleteByExample(MemberPointExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberPoint record);

    int insertSelective(MemberPoint record);

    List<MemberPoint> selectByExample(MemberPointExample example);

    MemberPoint selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberPoint record, @Param("example") MemberPointExample example);

    int updateByExample(@Param("record") MemberPoint record, @Param("example") MemberPointExample example);

    int updateByPrimaryKeySelective(MemberPoint record);

    int updateByPrimaryKey(MemberPoint record);
}