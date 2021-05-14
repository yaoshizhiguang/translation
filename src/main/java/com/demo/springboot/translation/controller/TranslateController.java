package com.demo.springboot.translation.controller;

import org.springframework.stereotype.Controller;

/*
本类是翻译模块的控制类
当翻译的输入是词典中的词语，访问词典
当输入不是词语时，调用模型翻译
返回翻译结果
 */
@Controller
public class TranslateController {
    /*
    get input from user
    if input is a entry in dictionary
        visit dictionary and find entry
        return information about this entry
    else
        invoke model to translate
        return result
     */
}
