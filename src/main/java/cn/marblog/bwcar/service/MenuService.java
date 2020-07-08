package cn.marblog.bwcar.service;

import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.SysMenu;
import cn.marblog.bwcar.utils.R;

import java.util.List;

public interface MenuService {
    DataGridResult findMenu(QueryDtO query);

    R deleteMenu(List<Long> ids);

    R findMenu();

    R saveMenu(SysMenu menu);

    R findMenuById(Long id);

    R updateMenu(SysMenu menu);

    List<String> findPermsByUserId(Long id);

    R findUserMenu(Long userId);
}
