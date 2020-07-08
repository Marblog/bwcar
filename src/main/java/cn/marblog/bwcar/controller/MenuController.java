package cn.marblog.bwcar.controller;

import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.log.MyLog;
import cn.marblog.bwcar.pojo.SysMenu;
import cn.marblog.bwcar.service.MenuService;
import cn.marblog.bwcar.utils.R;
import cn.marblog.bwcar.utils.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuController {

    @Autowired
    MenuService menuService;

    @MyLog("菜单列表")
    @RequestMapping("/sys/menu/list")
    public DataGridResult findMenu(QueryDtO query) {
        return menuService.findMenu(query);
    }

    @RequestMapping("/sys/menu/del")
    public R delMenu(@RequestBody List<Long> ids) {
        return menuService.deleteMenu(ids);
    }

    @RequestMapping("/sys/menu/select")
    public R selectMenu() {
        return menuService.findMenu();
    }

    @RequestMapping("/sys/menu/save")
    public R saveMenu(@RequestBody SysMenu menu) {
        return menuService.saveMenu(menu);
    }

    @RequestMapping("/sys/menu/info/{menuId}")
    public R findMenuById(@PathVariable("menuId") Long id) {
        return menuService.findMenuById(id);
    }

    @RequestMapping("/sys/menu/update")
    public R updateMenu(@RequestBody SysMenu menu) {
        return menuService.updateMenu(menu);
    }

    @RequestMapping("/sys/menu/user")
    public R userMenu() {
        long userId = ShiroUtils.getUserId();
        return menuService.findUserMenu(userId);
    }
}
