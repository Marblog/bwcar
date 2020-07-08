package cn.marblog.bwcar.service.impl;

import cn.marblog.bwcar.dao.SysRoleMapper;
import cn.marblog.bwcar.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    SysRoleMapper sysRoleMapper;

    @Override
    public List<String> findRolesByUserId(Long userId) {
        return sysRoleMapper.findRolesByUserId(userId);
    }
}
