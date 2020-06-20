package com.example.zgr.controller;


import com.example.zgr.model.User;
import com.example.zgr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class Provider_zgrController {
    @Autowired
    private UserService userService;
    @Value( "${server.port}" )
    private String port;

    @RequestMapping(value= "/test",method = RequestMethod.GET)//与ProviderInterface接口绑定，
    // 方法名字要与与ProviderInterface接口中GetMapping方法名一样
    public ModelAndView testMethod(User user, HttpServletRequest request) {
      //  System.out.println(user.getName());
        String a=request.getParameter("name");
        System.out.println(a);
        List<User> listuser=userService.queryAllUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("T_show");//要跳转的页面
        modelAndView.addObject("listuser", listuser);
        return  modelAndView;
    }
  /* // @Controller
    @RequestMapping(value = "/test2",method = RequestMethod.GET)//与ProviderInterface接口绑定，
    // 方法名字要与与ProviderInterface接口中GetMapping方法名一样
    public ModelAndView testMethod2(Model model) {
        List<User> listuser=userService.queryAllUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("T_show");//要跳转的页面
        modelAndView.addObject("listuser", listuser);
        return  modelAndView;

    }*/
//查询数据
    @RequestMapping("/queryAllUser")
    public ModelAndView queryAllUser(){
        List<User> listuser=userService.queryAllUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("T_show");//要跳转的页面
        modelAndView.addObject("listuser", listuser);
        return  modelAndView;
    }
    //删除数据
    @RequestMapping("/deleteUser")
    public ModelAndView deleteUser(int id){
        userService.deleteUser(id);
        List<User> listuser=userService.queryAllUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("T_show");//要跳转的页面
        modelAndView.addObject("listuser", listuser);
        return modelAndView;

    }
    //跳转到增加数据页面
    @RequestMapping("/addhtml")
    public ModelAndView addhtml(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Add");//要跳转的页面
        return modelAndView;
    }
    //增加数据
    @PostMapping("/add")
     public ModelAndView add(User user){
         userService.add(user);
         ModelAndView modelAndView = new ModelAndView();
         modelAndView.setViewName("Add");//要跳转的页面
         return modelAndView;
     }
    //查询审核
    @RequestMapping("/approve")
    public ModelAndView approve(){
        List<User> listuser=userService.approve("待审核","审核不通过");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Approve");//要跳转的页面
        modelAndView.addObject("listuser", listuser);
        return  modelAndView;
    }
    //修改审核
    @RequestMapping("/up_approve")
    public ModelAndView up_approve(User user){
        userService.up_approve(user.getT_approve(),user.getId());
        List<User> listuser=userService.approve("待审核","审核不通过");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Approve");//要跳转的页面
        modelAndView.addObject("listuser", listuser);
        return  modelAndView;
    }
}
