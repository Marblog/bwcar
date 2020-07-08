package cn.marblog.bwcar.dao;

import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.SysMenu;
import cn.marblog.bwcar.pojo.SysMenuExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SysMenuMapper {

    List<SysMenu> findMenu();

    int deleteMenu(List<Long> ids);

    long countByExample(SysMenuExample example);

    int deleteByExample(SysMenuExample example);

    int deleteByPrimaryKey(Long menuId);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    List<SysMenu> selectByExample(SysMenuExample example);

    SysMenu selectByPrimaryKey(Long menuId);

    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);

    List<SysMenu> findMenuByPage(QueryDtO query);

    List<String> findPermsByUserId(@Param("userId") Long userId);

    List<Map<String, Object>> findDirMenuByUserId(@Param("userId") Long userId);

    List<Map<String, Object>> findMenuNotButtonByUserId(@Param("userId") Long userId, @Param("parentId") Long parentId);
}