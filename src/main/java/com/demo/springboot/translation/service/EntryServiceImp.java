package com.demo.springboot.translation.service;


import com.demo.springboot.translation.common.domain.EntryExample;
import com.demo.springboot.translation.common.domain.EntryWithBLOBs;
import com.demo.springboot.translation.mapper.EntryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EntryServiceImp implements EntryService{

    EntryMapper entryMapper;

    @Override
    public void addWord(EntryWithBLOBs entryWithBLOBs) {
        entryMapper.insert(entryWithBLOBs);
    }

    @Override
    public void delete(EntryWithBLOBs entryWithBLOBs) {
        entryMapper.deleteByPrimaryKey(entryWithBLOBs.getEntryId());
    }

    @Override
    public EntryWithBLOBs getEntry(EntryWithBLOBs entryWithBLOBs) {
        return entryMapper.selectByPrimaryKey(entryWithBLOBs.getEntryId());
    }

    @Override
    public void update(EntryWithBLOBs entryWithBLOBs) {
        entryMapper.updateByPrimaryKey(entryWithBLOBs);
    }

    @Override
    public List<EntryWithBLOBs> getAllEntry(int collectionId) {
        EntryExample entryExample = new EntryExample();
        entryExample.createCriteria().andCollectionIdEqualTo(collectionId);
        return entryMapper.selectByExampleWithBLOBs(entryExample);
    }
}
