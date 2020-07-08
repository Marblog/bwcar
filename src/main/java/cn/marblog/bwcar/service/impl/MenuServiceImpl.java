package cn.marblog.bwcar.service.impl;

import cn.marblog.bwcar.dao.SysMenuMapper;
import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.SysMenu;
import cn.marblog.bwcar.service.MenuService;
import cn.marblog.bwcar.utils.R;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class MenuServiceImpl implements MenuService {


    @Autowired
    SysMenuMapper menuMapper;

    @Override
    public DataGridResult findMenu(QueryDtO query) {
        PageHelper.offsetPage(query.getOffset(), query.getLimit());

        if (query.getSort() != null && !"".equals(query.getSort())) {
            query.setSort("menu_id");
        }
        List<SysMenu> menuByPage = menuMapper.findMenuByPage(query);
        PageInfo<SysMenu> info = new PageInfo<>(menuByPage);
        long total = info.getTotal();

        return new DataGridResult(total, info.getList());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public R deleteMenu(List<Long> ids) {
        for (Long id : ids) {
            if (id < 51) {
                return R.error("系统菜单无法删除");
            }
        }

        int i = menuMapper.deleteMenu(ids);
        if (i > 0) {
            return R.ok();
        } else {
            return R.error(-200, "删除失败");
        }
    }

    @Override
    public R findMenu() {
        List<SysMenu> menu = menuMapper.findMenu();
        SysMenu sysMenu = new SysMenu();
        sysMenu.setMenuId(0L);
        sysMenu.setType(0);
        sysMenu.setParentId(-1L);
        sysMenu.setName("一级菜单");
        menu.add(sysMenu);
        return R.ok().put("menuList", menu);
    }

    @Override
    public R saveMenu(SysMenu menu) {
        int i = menuMapper.insertSelective(menu);

        return i > 0 ? R.ok() : R.error("添加失败");
    }

    @Override
    public R findMenuById(Long id) {
        SysMenu sysMenu = menuMapper.selectByPrimaryKey(id);
        return R.ok().put("menu", sysMenu);
    }

    @Override
    public R updateMenu(SysMenu menu) {
        int i = menuMapper.updateByPrimaryKey(menu);
        return i > 0 ? R.ok() : R.error("修改失败");
    }

    @Override
    public List<String> findPermsByUserId(Long id) {

        List<String> userId = menuMapper.findPermsByUserId(id);
        Set<String> set = new HashSet<>();
        for (String s : userId) {
            if (s != null && !"".equals(s)) {
                String[] split = s.split(",");
                Collections.addAll(set, split);
            }
        }
        return new ArrayList<>(set);
    }


    @Override
    public R findUserMenu(Long userId) {
        //查询用户的一级目录
        List<Map<String, Object>> dirMenuByUserId = menuMapper.findDirMenuByUserId(userId);
        //查询目录对应的子菜单
        for (Map<String, Object> map : dirMenuByUserId) {
            Long menuId = Long.parseLong(map.get("menuId") + "");
            List<Map<String, Object>> subList = menuMapper.findMenuNotButtonByUserId(userId, menuId);
            map.put("list", subList);
        }
        List<String> permsByUserId = findPermsByUserId(userId);
        return Objects.requireNonNull(R.ok().put("menuList", dirMenuByUserId)).put("permissions", permsByUserId);
    }
}
