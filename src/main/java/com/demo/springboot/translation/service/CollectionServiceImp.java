package com.demo.springboot.translation.service;


import com.demo.springboot.translation.common.domain.*;
import com.demo.springboot.translation.mapper.CollectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionServiceImp implements CollectionService{
    @Autowired
    CollectionMapper collectionMapper;

    @Override
    public void add(CollectionWithBLOBs collection) {
        collectionMapper.insert(collection);
    }

    @Override
    public List<CollectionWithBLOBs> getAllCollection(User user) {
        CollectionExample collectionExample = new CollectionExample();
        collectionExample.createCriteria().andCuidEqualTo(user.getUid());
        return collectionMapper.selectByExampleWithBLOBs(collectionExample);
    }


}
