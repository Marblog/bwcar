package cn.marblog.bwcar.service.impl;

import cn.marblog.bwcar.dao.MessageMapper;
import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.pojo.Message;
import cn.marblog.bwcar.pojo.MessageExample;
import cn.marblog.bwcar.service.MessageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageMapper messageMapper;

    @Override
    public int addMessage(Message message) {
        return messageMapper.insertSelective(message);
    }

    @Override
    public int delMessage(Long id) {
        return messageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateMessage(Message message) {
        return messageMapper.updateByPrimaryKeyWithBLOBs(message);
    }

    @Override
    public Message findById(Long id) {
        return messageMapper.selectByPrimaryKey(id);
    }

    @Override
    public DataGridResult findByPage(QueryDtO queryDtO) {
        PageHelper.offsetPage(queryDtO.getOffset(), queryDtO.getLimit());
        MessageExample example = new MessageExample();
        String sort = queryDtO.getSort();
        if (!StringUtils.isEmpty(sort)) {
            example.setOrderByClause("id");
        }
        List<Message> messages = messageMapper.selectByExampleWithBLOBs(example);
        PageInfo<Message> info = new PageInfo<>(messages);
        long total = info.getTotal();
        return new DataGridResult(total, messages);
    }
}
