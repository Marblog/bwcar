package cn.marblog.bwcar.controller;

import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.CarMake;
import cn.marblog.bwcar.service.CarMakeService;
import cn.marblog.bwcar.utils.R;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarMakeController {

    @Autowired
    CarMakeService carMakeService;

    @RequestMapping("/sys/make/list")
    public DataGridResult findMake(QueryDtO queryDtO) {
        return carMakeService.findByPage(queryDtO);
    }

    @RequestMapping("/sys/make/del")
    public R delMake(@RequestBody List<Integer> ids) {

        for (Integer id : ids) {
            carMakeService.delCarMake(id);
        }
        return R.ok();
    }

    @RequestMapping("/sys/make/info/{id}")
    public R findById(@PathVariable("id")Integer id){
        CarMake byId = carMakeService.findById(id);
        return R.ok().put("make",byId);

    }
    @RequestMapping("/sys/make/save")
    public R addMake(@RequestBody CarMake carMake){
        int i = carMakeService.addCarMake(carMake);
        return i>0?R.ok():R.error("添加失败");
    }

    @RequestMapping("/sys/make/update")
    public R updateMake(@RequestBody CarMake carMake){
        int i = carMakeService.updateCarMake(carMake);
        return i>0?R.ok():R.error("更新失败");
    }


}
