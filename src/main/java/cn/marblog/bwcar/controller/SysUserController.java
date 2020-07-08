package cn.marblog.bwcar.controller;

import cn.marblog.bwcar.pojo.SysUser;
import cn.marblog.bwcar.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysUserController {
    @Autowired
    SysUserService sysUserService;

    @RequestMapping("/find")
    public List<SysUser> findAll() {
        return sysUserService.findAll();
    }


}
