package com.demo.springboot.translation.service;

import com.demo.springboot.translation.common.domain.User;
import com.demo.springboot.translation.common.domain.UserExample;
import com.demo.springboot.translation.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public User checkUserAndPassword(User user) {
        UserExample ex = new UserExample();
        ex.createCriteria()
                .andUidEqualTo(user.getUid())
                .andPassEqualTo(user.getPass());
        List<User> users = userMapper.selectByExample(ex);

        User account = users.size() > 0 ? users.get(0) : null;
        return account;
    }

    @Override
    public User findUser(User user) {
        return userMapper.selectByPrimaryKey(user.getUid());
    }

    @Override
    public int saveUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
