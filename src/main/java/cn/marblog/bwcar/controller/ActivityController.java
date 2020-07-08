package cn.marblog.bwcar.controller;

import cn.marblog.bwcar.dto.ActivityDTO;
import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.service.ActivityService;
import cn.marblog.bwcar.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @RequestMapping("/sys/activity/list")
    public DataGridResult findAct(QueryDtO queryDTO) {
        return activityService.findByPage(queryDTO);
    }

    @RequestMapping("/sys/activity/del")
    public R delAct(@RequestBody List<Long> ids) {
        for (Long id : ids) {
            activityService.delActivity(id);
        }
        return R.ok();
    }


    @RequestMapping("/sys/activity/info/{id}")
    public R findActById(@PathVariable("id") Long id) {
        ActivityDTO byId = activityService.findById(id);
        return R.ok().put("activity", byId);
    }

    @RequestMapping("/sys/activity/save")
    public R addAct(@RequestBody ActivityDTO activityDTO) {
        int i = activityService.addActivity(activityDTO);
        return i > 0 ? R.ok() : R.error("添加失败");
    }

    @RequestMapping("/sys/activity/update")
    public R updateAct(@RequestBody ActivityDTO activityDTO) {
        int i = activityService.updateActivity(activityDTO);
        return i > 0 ? R.ok() : R.error("修改失败");
    }

}
