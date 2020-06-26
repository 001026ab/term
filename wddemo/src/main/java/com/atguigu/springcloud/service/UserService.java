package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    User select(@Param("username") String username, @Param("password") String password);
}
