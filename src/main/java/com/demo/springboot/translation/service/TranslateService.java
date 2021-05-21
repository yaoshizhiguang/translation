package com.demo.springboot.translation.service;

import org.springframework.stereotype.Service;

@Service
public interface TranslateService {

    String findInDic(String input, String type);
}
