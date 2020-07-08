package cn.marblog.bwcar.service.impl;

import cn.marblog.bwcar.dao.CarManufacturerMapper;
import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.CarManufacturer;
import cn.marblog.bwcar.pojo.CarManufacturerExample;
import cn.marblog.bwcar.service.CarmanuFacturerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class CarmanuFacturerServiceImpl implements CarmanuFacturerService {

    @Autowired
    private CarManufacturerMapper carManufacturerMapper;

    @Override
    public int addCarmanuFacturer(CarManufacturer carManufacturer) {
        return carManufacturerMapper.insertSelective(carManufacturer);
    }

    @Override
    public void delCarManu(Integer id) {
        carManufacturerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateCarmanuFacturer(CarManufacturer carManufacturer) {
        return carManufacturerMapper.updateByPrimaryKeySelective(carManufacturer);
    }

    @Override
    public CarManufacturer findById(Integer id) {
        return carManufacturerMapper.selectByPrimaryKey(id);
    }

    @Override
    public DataGridResult findByPage(QueryDtO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());
        CarManufacturerExample example = new CarManufacturerExample();
        String sort = queryDTO.getSort();
        if(!StringUtils.isEmpty(sort)){
            example.setOrderByClause("id");
        }
        List<CarManufacturer> carManufacturers = carManufacturerMapper.selectByExample(example);
        PageInfo<CarManufacturer> info = new PageInfo<>(carManufacturers);
        long total = info.getTotal();
        return new DataGridResult(total,carManufacturers);
    }

}
