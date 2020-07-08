package cn.marblog.bwcar.service.impl;

import cn.marblog.bwcar.dao.SysUserMapper;
import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.SysUser;
import cn.marblog.bwcar.service.SysUserService;
import cn.marblog.bwcar.utils.R;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.selectByExample(null);
    }

    @Override
    public DataGridResult findUserByPage(QueryDtO queryDtO) {
        PageHelper.offsetPage(queryDtO.getOffset(), queryDtO.getLimit());

        if (queryDtO.getSort() != null && "".equals(queryDtO.getSort())) {
            queryDtO.setSort("user_id");
        }

        List<SysUser> sysUsers = sysUserMapper.findByPage(queryDtO);
        PageInfo<SysUser> info = new PageInfo<>(sysUsers);
        long total = info.getTotal();
        return new DataGridResult(total, info.getList());
    }

    @Override
    public Workbook expotUser() {
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("信息");
        String[] titles = {"用户id", "用户名", "邮箱", "电话", "创建时间"};
        String[] colums = {"userId", "username", "email", "mobile", "createTime"};
        List<Map<String, Object>> maps = sysUserMapper.exportUser();
        Row row = sheet.createRow(0);
        for (int i = 0; i < titles.length; i++) {
            Cell cell = row.createCell(i);
            cell.setCellValue(titles[i]);
        }
        //遍历数据
        for (int i = 0; i < maps.size(); i++) {
            //一条记录创建1条Row对象，从第二行开始，Row+1
            Row row1 = sheet.createRow(i + 1);
            //填充单元格
            for (int j = 0; j < titles.length; j++) {
                Cell cell = row1.createCell(j);
                //获取用户id的值
                Map<String, Object> rowValue = maps.get(i);
                Object o = rowValue.get(colums[j]);
                cell.setCellValue(o + "");
            }
        }
        return workbook;
    }

    @Override
    public SysUser findByUsername(String username) {
        return sysUserMapper.findByUsername(username);

    }

    @Override
    public R updatePassword(String username, String password) {
        return null;
    }


}
