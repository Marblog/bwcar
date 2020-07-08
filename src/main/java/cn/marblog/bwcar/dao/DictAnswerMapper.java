package cn.marblog.bwcar.dao;

import cn.marblog.bwcar.pojo.DictAnswer;
import cn.marblog.bwcar.pojo.DictAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictAnswerMapper {
    long countByExample(DictAnswerExample example);

    int deleteByExample(DictAnswerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DictAnswer record);

    int insertSelective(DictAnswer record);

    List<DictAnswer> selectByExample(DictAnswerExample example);

    DictAnswer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DictAnswer record, @Param("example") DictAnswerExample example);

    int updateByExample(@Param("record") DictAnswer record, @Param("example") DictAnswerExample example);

    int updateByPrimaryKeySelective(DictAnswer record);

    int updateByPrimaryKey(DictAnswer record);
}