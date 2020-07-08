package cn.marblog.bwcar.controller;

import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.Car;
import cn.marblog.bwcar.pojo.CarMake;
import cn.marblog.bwcar.service.CarMakeService;
import cn.marblog.bwcar.service.CarService;
import cn.marblog.bwcar.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    CarService carService;
    @Autowired
    CarMakeService carMakeService;

    @RequestMapping("/sys/car/list")
    public DataGridResult findByPage(QueryDtO queryDtO) {
        return carService.findByPage(queryDtO);
    }

    @RequestMapping("/sys/car/del")
    public R delCar(@RequestBody List<Integer> ids) {
        for (Integer id : ids) {
            carService.delCar(id);
        }
        return R.ok();
    }

    @RequestMapping("/sys/car/typeall")
    public R typeAll() {
        List<CarMake> all = carMakeService.findAll();
        return R.ok().put("sites", all);
    }

    @RequestMapping("/sys/car/info/{id}")
    public R findById(@PathVariable("id") Integer id) {
        Car byId = carService.findById(id);
        return R.ok().put("car", byId);
    }

    @RequestMapping("/sys/car/save")
    public R addCar(@RequestBody Car car) {
        int i = carService.addCar(car);
        return i > 0 ? R.ok() : R.error("添加失败");
    }

    @RequestMapping("/sys/car/update")
    public R updateCar(@RequestBody Car car) {
        int i = carService.updateCar(car);
        return i > 0 ? R.ok() : R.error("更新失败");
    }
}
