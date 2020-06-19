package com.example.zgr.service;


import com.example.zgr.model.User;

import java.util.List;

public interface UserService {
     List<User> queryAllUser();
     int deleteUser(int id);
     int add(User user);
}
