package wddemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import wddemo.pojo.adminuser;
import wddemo.services.adminServices;

@Controller
public class adminController {

    @Autowired
    adminServices adminServices;


    @RequestMapping("/wd")
    public String toindex(){
        return "admlogin";
    }

    @RequestMapping("/wd/admlogin")
    public String admlogin(String name, String pass, Model model){
        adminuser selectone = adminServices.selectone(name, pass);
        if (selectone==null){
            model.addAttribute("tip","输入有误");
            return "admlogin";
        }else{
            model.addAttribute("tip","");
            return "initAdmin";
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
