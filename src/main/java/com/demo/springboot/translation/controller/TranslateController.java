package com.demo.springboot.translation.controller;

import com.demo.springboot.translation.common.domain.HistoryWithBLOBs;
import com.demo.springboot.translation.common.domain.User;
import com.demo.springboot.translation.mapper.CteMapper;
import com.demo.springboot.translation.mapper.PteMapper;
import com.demo.springboot.translation.mapper.RteMapper;
import com.demo.springboot.translation.service.HistoryService;
import com.demo.springboot.translation.service.TranslateService;
import com.demo.springboot.translation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;
import java.util.logging.Logger;
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
    private HistoryService historyService;
    @Autowired
    private UserService userService;
    @Autowired
    private CteMapper cteMapper;
    @Autowired
    private PteMapper pteMapper;
    @Autowired
    private RteMapper rteMapper;
    /*
    get input from user
    */
    @PostMapping("/translate")
    public String translate(@RequestParam("input")String input,
                            @RequestParam("type")String type, User user, Model model)   {
        String result = translateService.findInDic(input,type);
        HistoryWithBLOBs history = new HistoryWithBLOBs();
        history.setOriginText(input);
        history.setHuid(userService.findUser(user).getUid());
        //user.getUid()

        if(result!=null){
            //存入历史记录
            history.setResultText(result);
            history.setTime(new Date());

            historyService.add(history);

            model.addAttribute("result",result);

            return "translate";
        }else{
            //调用翻译程序
            //result = 调用翻译程序
            //返回
            return "";
        }
    }

//  if input is a entry in dictionary

//        visit dictionary and find entry
//        return information about this entry
//    else
//        invoke model to translate
//        return result

}
