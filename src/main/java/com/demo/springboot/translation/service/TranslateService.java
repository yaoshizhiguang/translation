package com.demo.springboot.translation.service;

import org.springframework.stereotype.Service;

@Service
public interface TranslateService {

    boolean isInDic(String input,String type);
}
