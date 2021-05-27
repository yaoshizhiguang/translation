package com.demo.springboot.translation.controller;

import com.demo.springboot.translation.common.domain.*;
import com.demo.springboot.translation.service.CollectionService;
import com.demo.springboot.translation.service.EntryService;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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

    /*
    导出为xls
     */
    @RequestMapping(value = "UserExcelDownloads", method = RequestMethod.GET)
    public void downloadAllEntry(HttpServletResponse response,
                                 CollectionWithBLOBs collectionWithBLOBs) throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("信息表");

        List<EntryWithBLOBs> allEntry = entryService.getAllEntry(collectionWithBLOBs.getCid());

        String fileName = ""+collectionWithBLOBs.getCname()  + ".xls";//设置要导出的文件的名字
        //新增数据行，并且设置单元格数据

        int rowNum = 1;

        String[] headers = { "序号", "词条", "类型", "翻译结果", "备注"};
        //headers表示excel表中第一行的表头

        HSSFRow row = sheet.createRow(0);
        //在excel表中添加表头

        for(int i=0;i<headers.length;i++){
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }

        //在表中存放查询到的数据放入对应的列
        for (EntryWithBLOBs entryWithBLOBs : allEntry) {
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell(0).setCellValue(entryWithBLOBs.getEntryId());
            row1.createCell(1).setCellValue(entryWithBLOBs.getInput());
            row1.createCell(2).setCellValue(entryWithBLOBs.getType());
            row1.createCell(3).setCellValue(entryWithBLOBs.getOutput());
            row1.createCell(4).setCellValue(entryWithBLOBs.getMarks());
            rowNum++;
        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        response.flushBuffer();
        workbook.write(response.getOutputStream());
    }


}
