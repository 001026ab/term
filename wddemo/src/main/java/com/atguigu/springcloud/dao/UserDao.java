package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {

    User select(@Param("username") String username, @Param("password") String password);
}
