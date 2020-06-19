package com.example.zgr.dao;


import com.example.zgr.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
     List<User> queryUser();
     int deleUser(int id);
     int add(User user);
}
