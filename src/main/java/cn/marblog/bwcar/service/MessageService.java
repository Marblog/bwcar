package cn.marblog.bwcar.service;

import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.Message;

public interface MessageService {
    int addMessage(Message message);

    int delMessage(Long id);

    int updateMessage(Message message);

    Message findById(Long id);

    DataGridResult findByPage(QueryDtO queryDtO);
}
