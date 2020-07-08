package cn.marblog.bwcar.dao;

import cn.marblog.bwcar.pojo.MemberTag;
import cn.marblog.bwcar.pojo.MemberTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberTagMapper {
    long countByExample(MemberTagExample example);

    int deleteByExample(MemberTagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberTag record);

    int insertSelective(MemberTag record);

    List<MemberTag> selectByExample(MemberTagExample example);

    MemberTag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberTag record, @Param("example") MemberTagExample example);

    int updateByExample(@Param("record") MemberTag record, @Param("example") MemberTagExample example);

    int updateByPrimaryKeySelective(MemberTag record);

    int updateByPrimaryKey(MemberTag record);
}