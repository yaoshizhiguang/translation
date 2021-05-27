package com.demo.springboot.translation.service;

import com.demo.springboot.translation.common.domain.History;
import com.demo.springboot.translation.common.domain.HistoryExample;
import com.demo.springboot.translation.common.domain.HistoryWithBLOBs;
import com.demo.springboot.translation.common.domain.User;
import com.demo.springboot.translation.mapper.HistoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HistoryServiceImp implements HistoryService {

     private HistoryMapper historyMapper;


    @Override
    public void add(HistoryWithBLOBs history) {
        historyMapper.insert(history);
    }

    @Override
    public List<HistoryWithBLOBs> getAllHistory(User user) {
        HistoryExample historyExample = new HistoryExample();
        historyExample.createCriteria().andHuidEqualTo(user.getUid());
        return historyMapper.selectByExampleWithBLOBs(historyExample);
    }


}