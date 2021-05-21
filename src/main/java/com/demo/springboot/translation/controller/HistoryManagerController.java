package com.demo.springboot.translation.controller;

import com.demo.springboot.translation.mapper.UserMapper;
import com.demo.springboot.translation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HistoryManagerController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/show_history")
    public String gotoHistory(){
        return "history";
    }


}
