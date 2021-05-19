package com.demo.springboot.translation.service;

import com.demo.springboot.translation.common.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User checkUserAndPassword(User user);
    User findUser(User user);
    int saveUser(User user);
    int updateUser(User user);
}
