package yfqdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yfqdemo.pojo.Course;
import yfqdemo.services.CourseServices;

@Controller
public class CourseController {

    @Autowired
    CourseServices courseServices;

    @RequestMapping("/yfq/allcourse")
    public String allcourse(Model model){
        model.addAttribute("courselist",courseServices.allCourse());
        return "main";
    }

    @RequestMapping("/yfq/add")
    public String toadd(){
        return "add";
    }

    @RequestMapping("/yfq/doadd")
    public String doadd(String cno,String cname,String tname,String ctime,Model model){
        courseServices.doadd(new Course(cno,cname,tname,Integer.parseInt(ctime)));
        model.addAttribute("courselist",courseServices.allCourse());
        return "main";
    }

    @RequestMapping("/yfq/del")
    public String dodel(String id,Model model){
        courseServices.delcourse(id.substring(1));
        model.addAttribute("courselist",courseServices.allCourse());
        return "main";
    }

    @RequestMapping("/yfq/update")
    public String selectone(String id,Model model){
        model.addAttribute("coursemes",courseServices.selectone(id.substring(1)));
        return "update";
    }

    @RequestMapping("/yfq/doupdate")
    public String daupdate(String cno,String cname,String tname,String ctime,Model model){
        courseServices.doupdate(new Course(cno,cname,tname,Integer.parseInt(ctime)));
        model.addAttribute("courselist",courseServices.allCourse());
        return "main";
    }
}
