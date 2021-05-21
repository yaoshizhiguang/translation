package com.demo.springboot.translation.service;



import com.demo.springboot.translation.common.domain.CollectionWithBLOBs;
import com.demo.springboot.translation.common.domain.Entry;
import com.demo.springboot.translation.common.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface CollectionService {
    public void add(CollectionWithBLOBs collection);


    List<CollectionWithBLOBs> getAllCollection(User user);
}
