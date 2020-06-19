package com.example.zgr.service.impl;

import com.example.zgr.dao.UserMapper;
import com.example.zgr.model.User;
import com.example.zgr.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    //查询数据
    @Override
    public List<User> queryAllUser() {
        return userMapper.queryUser();
    }
//删除数据
    @Override
    public int deleteUser(int id) {
        return userMapper.deleUser(id);
    }

    @Override
    public int add(User user) {
        return userMapper.add(user);
    }
}
