package cn.marblog.bwcar.controller;

import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.CarParamType;
import cn.marblog.bwcar.pojo.CarParams;
import cn.marblog.bwcar.service.CarParamService;
import cn.marblog.bwcar.service.CarParamTypeService;
import cn.marblog.bwcar.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarParamController {

    @Autowired
    CarParamService carParamService;
    @Autowired
    CarParamTypeService carParamTypeService;

    @RequestMapping("/sys/params/list")
    public DataGridResult findByPage(QueryDtO queryDtO) {
        return carParamService.findByPage(queryDtO);
    }

    @RequestMapping("/sys/params/del")
    public R delCarParam(@RequestBody List<Integer> ids) {
        for (Integer id : ids) {
            carParamService.delCarParam(id);
        }
        return R.ok();
    }

    @RequestMapping("/sys/params/typeall")
    public R typeAll() {
        List<CarParamType> all = carParamTypeService.findAll();
        return R.ok().put("sites", all);
    }

    @RequestMapping("/sys/params/info/{id}")
    public R findById(@PathVariable Integer id) {
        CarParams byId = carParamService.findById(id);
        return R.ok().put("params", byId);
    }

    @RequestMapping("/sys/params/save")
    public R addParams(@RequestBody CarParams carParams) {
        int i = carParamService.addCarParam(carParams);
        return i > 0 ? R.ok() : R.error("添加失败");
    }

    @RequestMapping("/sys/params/update")
    public R uptadeParams(@RequestBody CarParams carParams) {
        int i = carParamService.updateCarParam(carParams);
        return i > 0 ? R.ok() : R.error("更新失败");
    }
}
