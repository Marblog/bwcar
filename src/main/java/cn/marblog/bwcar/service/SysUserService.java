package cn.marblog.bwcar.service;


import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.SysUser;
import cn.marblog.bwcar.utils.R;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.List;

public interface SysUserService {
    List<SysUser> findAll();

    DataGridResult findUserByPage(QueryDtO queryDtO);

    Workbook expotUser();

    SysUser findByUsername(String username);

    R updatePassword(String username,String password);
}
