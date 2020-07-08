package cn.marblog.bwcar.service.impl;

import cn.marblog.bwcar.dao.CarModelMapper;
import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.CarModel;
import cn.marblog.bwcar.pojo.CarModelExample;
import cn.marblog.bwcar.service.CarModelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarModelServiceImpl implements CarModelService {

    @Autowired
    CarModelMapper carModelMapper;

    @Override
    public int addCarModel(CarModel carModel) {
        return carModelMapper.insertSelective(carModel);
    }

    @Override
    public void delCarModel(Integer id) {
        carModelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateCarModel(CarModel carModel) {
        return carModelMapper.updateByPrimaryKeySelective(carModel);
    }

    @Override
    public CarModel findById(Integer id) {
        return carModelMapper.selectByPrimaryKey(id);
    }

    @Override
    public DataGridResult findByPage(QueryDtO queryDtO) {
        PageHelper.offsetPage(queryDtO.getOffset(), queryDtO.getLimit());
        String sort = queryDtO.getSort();
        CarModelExample example = new CarModelExample();
        if (!StringUtils.isEmpty(sort)) {
            example.setOrderByClause("id");
        }

        List<CarModel> carModels = carModelMapper.selectByExample(example);
        PageInfo<CarModel> pageInfo = new PageInfo<>(carModels);
        long total = pageInfo.getTotal();
        return new DataGridResult(total, carModels);
    }


}
