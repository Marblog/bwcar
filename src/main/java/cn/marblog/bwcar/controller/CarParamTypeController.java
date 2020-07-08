package cn.marblog.bwcar.controller;

import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.CarParamType;
import cn.marblog.bwcar.service.CarParamTypeService;
import cn.marblog.bwcar.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarParamTypeController {

    @Autowired
    CarParamTypeService carParamTypeService;

    @RequestMapping("/sys/paramtype/list")
    public DataGridResult findCarParamTypeByPage(QueryDtO queryDtO) {
        return carParamTypeService.findByPage(queryDtO);
    }

    @RequestMapping("/sys/paramtype/del")
    public R delCarParamType(@RequestBody List<Integer> ids) {
        for (Integer id : ids) {
            carParamTypeService.delCarParamType(id);
        }
        return R.ok();
    }

    @RequestMapping("/sys/paramtype/info/{id}")
    public R findById(@PathVariable("id")Integer id){
        return R.ok().put("paramtype",carParamTypeService.findById(id));
    }

    @RequestMapping("/sys/paramtype/save")
    public R add(@RequestBody CarParamType carParamType){
        return carParamTypeService.addCarParamType(carParamType)>0?R.ok():R.error("添加失败");
    }

    @RequestMapping("/sys/paramtype/update")
    public R update(@RequestBody CarParamType carParamType){
        return carParamTypeService.updateCarParamType(carParamType)>0?R.ok():R.error("更新失败");
    }

}
