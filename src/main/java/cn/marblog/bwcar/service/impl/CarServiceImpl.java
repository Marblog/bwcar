package cn.marblog.bwcar.service.impl;

import cn.marblog.bwcar.dao.CarMapper;
import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.Car;
import cn.marblog.bwcar.pojo.CarExample;
import cn.marblog.bwcar.service.CarService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarMapper carMapper;

    @Override
    public int addCar(Car car) {
        return carMapper.insertSelective(car);
    }

    @Override
    public void delCar(Integer id) {
        carMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateCar(Car car) {
        return carMapper.updateByPrimaryKeySelective(car);
    }

    @Override
    public Car findById(Integer id) {
        return carMapper.selectByPrimaryKey(id);
    }

    @Override
    public DataGridResult findByPage(QueryDtO queryDtO) {
        PageHelper.offsetPage(queryDtO.getOffset(), queryDtO.getLimit());
        String sort = queryDtO.getSort();
        CarExample example = new CarExample();
        if (!StringUtils.isEmpty(sort)) {
            example.setOrderByClause("id");
        }
        List<Car> cars = carMapper.selectByExample(example);
        PageInfo<Car> pageInfo = new PageInfo<>(cars);
        long total = pageInfo.getTotal();
        return new DataGridResult(total, cars);
    }
}
