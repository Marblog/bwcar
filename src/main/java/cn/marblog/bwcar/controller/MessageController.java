package cn.marblog.bwcar.controller;

import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.Message;
import cn.marblog.bwcar.service.MessageService;
import cn.marblog.bwcar.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MessageController {
    @Autowired
    MessageService messageService;


    @RequestMapping("/sys/message/list")
    public DataGridResult findByPage(QueryDtO queryDtO) {
        return messageService.findByPage(queryDtO);
    }

    @RequestMapping("/sys/message/del")
    public R delMessage(@RequestBody List<Long> ids) {
        for (Long id : ids) {
            messageService.delMessage(id);
        }
        return R.ok();
    }

    @RequestMapping("/sys/message/info/{id}")
    public R findById(@PathVariable("id") Long id) {
        Message byId = messageService.findById(id);
        return R.ok().put("message", byId);
    }

    @RequestMapping("/sys/message/save")
    public R addMessage(@RequestBody Message message) {
        int i = messageService.addMessage(message);
        return i > 0 ? R.ok() : R.error("添加失败");
    }

    @RequestMapping("/sys/message/update")
    public R updateMessage(@RequestBody Message message) {
        int i = messageService.updateMessage(message);
        return i > 0 ? R.ok() : R.error("更新失败");
    }
}
