package com.demo.springboot.translation.controller;

import com.demo.springboot.translation.mapper.CteMapper;
import com.demo.springboot.translation.mapper.PteMapper;
import com.demo.springboot.translation.mapper.RteMapper;
import com.demo.springboot.translation.service.TranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

/*
本类是翻译模块的控制类
当翻译的输入是词典中的词语，访问词典
当输入不是词语时，调用模型翻译
返回翻译结果
 */
@Controller
public class TranslateController {
    @Autowired
    private TranslateService translateService;
    @Autowired
    private CteMapper cteMapper;
    @Autowired
    private PteMapper pteMapper;
    @Autowired
    private RteMapper rteMapper;
    /*
    get input from user
    */
    String input;
//  if input is a entry in dictionary
    public boolean isInputInDic(@RequestParam("input")String input,@RequestParam("type")String type){
        return translateService.isInDic(input,type);
    }

//        visit dictionary and find entry
//        return information about this entry
//    else
//        invoke model to translate
//        return result

}
