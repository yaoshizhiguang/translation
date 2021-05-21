package com.demo.springboot.translation.controller;

import com.demo.springboot.translation.common.domain.History;
import com.demo.springboot.translation.common.domain.HistoryWithBLOBs;
import com.demo.springboot.translation.common.domain.User;
import com.demo.springboot.translation.mapper.HistoryMapper;
import com.demo.springboot.translation.mapper.UserMapper;
import com.demo.springboot.translation.service.HistoryService;
import com.demo.springboot.translation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HistoryManagerController {
    @Autowired
    private HistoryService historyService;
    @Autowired
    private HistoryMapper historyMapper;

    @GetMapping("/show_history")
    public String goToHistory(){
        return "history";
    }


    public String getAllHistory(User user, Model model){
        List<HistoryWithBLOBs> historyList =historyService.getAllHistory(user);
        model.addAttribute("historyList",historyList);
        return "";
    }

    public String deleteHistory(int hId){
        historyMapper.deleteByPrimaryKey(hId);
        return "";
    }

}
