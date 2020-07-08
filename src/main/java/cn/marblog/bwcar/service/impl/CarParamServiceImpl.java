package cn.marblog.bwcar.service.impl;

import cn.marblog.bwcar.dao.CarParamsMapper;
import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.CarParams;
import cn.marblog.bwcar.pojo.CarParamsExample;
import cn.marblog.bwcar.service.CarParamService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarParamServiceImpl implements CarParamService {

    @Autowired
    CarParamsMapper carParamsMapper;

    @Override
    public int addCarParam(CarParams carParams) {
        return carParamsMapper.insertSelective(carParams);
    }

    @Override
    public void delCarParam(Integer id) {
        carParamsMapper.deleteByPrimaryKey(id);

    }

    @Override
    public int updateCarParam(CarParams carParams) {
        return carParamsMapper.updateByPrimaryKeySelective(carParams);
    }

    @Override
    public CarParams findById(Integer id) {
        return carParamsMapper.selectByPrimaryKey(id);
    }

    @Override
    public DataGridResult findByPage(QueryDtO queryDtO) {
        PageHelper.offsetPage(queryDtO.getOffset(), queryDtO.getLimit());
        String sort = queryDtO.getSort();

        CarParamsExample example = new CarParamsExample();
        if (!StringUtils.isEmpty(sort)) {
            example.setOrderByClause("id");
        }
        List<CarParams> carParams = carParamsMapper.selectByExample(example);
        PageInfo<CarParams> paramsPageInfo = new PageInfo<>(carParams);
        long total = paramsPageInfo.getTotal();

        return new DataGridResult(total, carParams);
    }
}
