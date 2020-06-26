package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.UserDao;
import com.atguigu.springcloud.entities.User;
import com.atguigu.springcloud.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User select(String username, String password) {
        return userDao.select(username,password);
    }
}
