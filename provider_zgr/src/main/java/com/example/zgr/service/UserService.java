package com.example.zgr.service;


import com.example.zgr.model.User;

import java.util.List;

public interface UserService {
     List<User> queryAllUser();
     int deleteUser(int id);
     int add(User user);
     List<User> approve(String t_approve1,String t_approve2);
     int up_approve(String t_approve,int id);
}
