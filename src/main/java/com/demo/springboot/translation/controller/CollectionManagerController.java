package com.demo.springboot.translation.controller;

import com.demo.springboot.translation.common.domain.*;
import com.demo.springboot.translation.service.CollectionService;
import com.demo.springboot.translation.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
本类是收藏夹管理的控制类
管理收藏夹的添加删除查询
导出、创建收藏夹等
 */
@Controller
public class CollectionManagerController {
    @Autowired
    CollectionService collectionService;
    @Autowired
    EntryService entryService;
    /*
    添加到收藏夹
     */
    public void addTOCollection(int collectionId, EntryWithBLOBs entry){
        entry.setCollectionId(collectionId);
        entryService.addWord(entry);

    }

    /*
    创建收藏夹
     */
    public void createCollection(User user,String collectionName){
        //get user‘s collection for datebase
        CollectionWithBLOBs collectionWithBLOBs = new CollectionWithBLOBs();
        collectionWithBLOBs.setCname(collectionName);
        collectionWithBLOBs.setCuid(user.getUid());
        collectionService.add(collectionWithBLOBs);

    }

    /*
    从收藏夹删除
     */
    public void deleteFromCollection(int entryId){
        EntryWithBLOBs entryWithBLOBs = new EntryWithBLOBs();
        entryWithBLOBs.setEntryId(entryId);
        entryService.delete(entryWithBLOBs);
    }

    /*
    添加备注
     */
    public void addMarks(int entryId,String mark){
        EntryWithBLOBs entryWithBLOBs = getEntry(entryId);
        entryWithBLOBs.setMarks(mark);
        entryService.update(entryWithBLOBs);

    }

    /*
    查找词条
     */
    public EntryWithBLOBs getEntry(int entryId){
        EntryWithBLOBs entryWithBLOBs = new EntryWithBLOBs();
        entryWithBLOBs.setEntryId(entryId);
        return entryService.getEntry(entryWithBLOBs);
    }

    /*
    收藏夹列表
     */
    public List<CollectionWithBLOBs> listCollection(User user){
        List<CollectionWithBLOBs> result = collectionService.getAllCollection(user);
        return result;
    }

    /*
    词条列表
     */
    public List<EntryWithBLOBs> listEntry(int collectionId){
        List<EntryWithBLOBs> result = entryService.getAllEntry(collectionId);
        return result;
    }

}
