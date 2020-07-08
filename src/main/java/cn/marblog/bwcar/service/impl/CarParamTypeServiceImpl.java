package cn.marblog.bwcar.service.impl;

import cn.marblog.bwcar.dao.CarParamTypeMapper;
import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.CarParamType;
import cn.marblog.bwcar.pojo.CarParamTypeExample;
import cn.marblog.bwcar.service.CarParamTypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarParamTypeServiceImpl implements CarParamTypeService {

    @Autowired
    CarParamTypeMapper carParamTypeMapper;

    @Override
    public int addCarParamType(CarParamType carParamType) {
        return carParamTypeMapper.insertSelective(carParamType);
    }

    @Override
    public void delCarParamType(Integer id) {
        carParamTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateCarParamType(CarParamType carParamType) {
        return carParamTypeMapper.updateByPrimaryKeySelective(carParamType);
    }

    @Override
    public CarParamType findById(Integer id) {
        return carParamTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CarParamType> findAll() {
        return carParamTypeMapper.selectByExample(null);
    }

    @Override
    public DataGridResult findByPage(QueryDtO queryDtO) {

        PageHelper.offsetPage(queryDtO.getOffset(), queryDtO.getLimit());
        CarParamTypeExample example = new CarParamTypeExample();
        String sort = queryDtO.getSort();
        if (StringUtils.isEmpty(sort)) {
            example.setOrderByClause("id");
        }
        List<CarParamType> carParamTypes = carParamTypeMapper.selectByExample(example);
        PageInfo<CarParamType> info = new PageInfo<>(carParamTypes);
        long total = info.getTotal();
        return new DataGridResult(total, carParamTypes);
    }
}
