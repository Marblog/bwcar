package cn.marblog.bwcar.service.impl;

import cn.marblog.bwcar.dao.CarMakeMapper;
import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.CarExample;
import cn.marblog.bwcar.pojo.CarMake;
import cn.marblog.bwcar.pojo.CarMakeExample;
import cn.marblog.bwcar.service.CarMakeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarMakeServiceImpl implements CarMakeService {

    @Autowired
    CarMakeMapper carMakeMapper;


    @Override
    public int addCarMake(CarMake carMake) {

        return carMakeMapper.insertSelective(carMake);
    }

    @Override
    public void delCarMake(Integer id) {
        carMakeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateCarMake(CarMake carMake) {
        return carMakeMapper.updateByPrimaryKey(carMake);
    }

    @Override
    public CarMake findById(Integer id) {
        return carMakeMapper.selectByPrimaryKey(id);
    }

    @Override
    public DataGridResult findByPage(QueryDtO queryDtO) {
        PageHelper.offsetPage(queryDtO.getOffset(), queryDtO.getLimit());

        CarMakeExample carExample = new CarMakeExample();
        String sort = queryDtO.getSort();
        if (!StringUtils.isEmpty(sort)) {
            carExample.setOrderByClause("id");
        }
        List<CarMake> carMakes = carMakeMapper.selectByExample(carExample);
        PageInfo<CarMake> pageInfo = new PageInfo<>(carMakes);
        long total = pageInfo.getTotal();
        return new DataGridResult(total, carMakes);
    }

    @Override
    public List<CarMake> findAll() {
        return carMakeMapper.selectByExample(null);
    }
}
