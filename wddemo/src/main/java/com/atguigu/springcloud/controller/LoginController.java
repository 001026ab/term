package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.User;
import com.atguigu.springcloud.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Slf4j
@Controller
public class LoginController {
    /**
     * 登录
     */

    @Autowired
    UserService userService;

    @RequestMapping("/wd")
    public String toindex(){
        return "index";
    }

    @RequestMapping("/wd/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session) {
        User select = userService.select(username, password);
        if (select == null) {
            model.addAttribute("msg", "用户名或密码错误！");
            return "index";
        } else {
            return "commons/commons";
        }
    }

    @RequestMapping("/wd/tostu")
    public String tostu(){
        return "stulogin";
    }

    @RequestMapping("/wd/stulogin")
    public String stulogin(String name, String pass, Model model){

        if (name.equals("张三") && pass.equals("123")){
            model.addAttribute("flag","");
            return "stu";
        }else{
            model.addAttribute("flag","输入有误");
            return "stulogin";
        }
    }
}
