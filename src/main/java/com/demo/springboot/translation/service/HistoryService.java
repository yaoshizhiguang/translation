package com.demo.springboot.translation.service;

import com.demo.springboot.translation.common.domain.CollectionWithBLOBs;
import com.demo.springboot.translation.common.domain.History;
import com.demo.springboot.translation.common.domain.HistoryWithBLOBs;
import com.demo.springboot.translation.common.domain.User;

import java.util.List;

public interface HistoryService {
    void add(HistoryWithBLOBs history);


    List<HistoryWithBLOBs> getAllHistory(User user);

}
