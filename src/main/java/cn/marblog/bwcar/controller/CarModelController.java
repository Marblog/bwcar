package cn.marblog.bwcar.controller;

import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.CarMake;
import cn.marblog.bwcar.pojo.CarModel;
import cn.marblog.bwcar.service.CarMakeService;
import cn.marblog.bwcar.service.CarModelService;
import cn.marblog.bwcar.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarModelController {
    @Autowired
    CarModelService carModelService;

    @Autowired
    CarMakeService carMakeService;

    @RequestMapping("/sys/model/list")
    public DataGridResult findByPage(QueryDtO queryDtO) {
        return carModelService.findByPage(queryDtO);
    }

    @RequestMapping("/sys/model/del")
    public R delCarModel(@RequestBody List<Integer> ids) {
        for (Integer id : ids) {
            carModelService.delCarModel(id);
        }
        return R.ok();
    }

    @RequestMapping("/sys/model/typeall")
    public R typeAll() {
        List<CarMake> all = carMakeService.findAll();
        return R.ok().put("sites", all);
    }

    @RequestMapping("/sys/model/info/{id}")
    public R findById(@PathVariable("id") Integer id) {
        CarModel byId = carModelService.findById(id);
        return R.ok().put("model", byId);
    }

    @RequestMapping("/sys/model/save")
    public R addCarModel(@RequestBody CarModel carModel) {
        int i = carModelService.addCarModel(carModel);
        return i > 0 ? R.ok() : R.error("添加失败");
    }

    @RequestMapping("/sys/model/update")
    public R updateCarModel(@RequestBody CarModel carModel) {
        int i = carModelService.updateCarModel(carModel);
        return i > 0 ? R.ok() : R.error("更新失败");
    }
}
