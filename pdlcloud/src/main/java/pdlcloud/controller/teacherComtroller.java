package pdlcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pdlcloud.pojo.Teacher;
import pdlcloud.services.teacherServices;

@Controller
public class teacherComtroller {

    @Autowired
    teacherServices teacherServices;

//    初始化查看所有的教师信息
    @RequestMapping("/pdl/all")
    public String allteacher(Model model){
        model.addAttribute("teacherlist",teacherServices.allteacher());
        return "main";
    }

//   跳转到添加页面
    @RequestMapping("/pdl/add")
    public String addteacher(){
        return "add";
    }

//   执行添加教师添加的功能
    @RequestMapping("/pdl/doadd")
    public String doadd(String tid,String tname,String tsex,int tage,String taddress){
        Teacher teacher = new Teacher(tid,tname,tsex,tage,taddress);
        teacherServices.addTeacher(teacher);
        return "add";
    }

//    按照id删除指定的教师
    @RequestMapping("/pdl/delteacher")
    public String delteacher(String id,Model model){
        id = id.substring(1);
        System.out.println("控制器层"+id.length());
        System.out.println(id);
        teacherServices.delTeacher(id);
        model.addAttribute("teacherlist",teacherServices.allteacher());
        return "main";
    }

//   查询出想要更新的教师的信息
    @RequestMapping("/pdl/update")
    public String updatetea(String id,Model model){
        id = id.substring(1);
        System.out.println("教师id"+id);
        System.out.println("信息"+teacherServices.selectone(id));
        model.addAttribute("updatelist",teacherServices.selectone(id));
        return "update";
    }


//    执行更新操作
    @RequestMapping("/pdl/doupdate")
    public String doupdate(String tid,String tname,String tsex,int tage,String taddress,Model model){
        Teacher teacher = new Teacher(tid,tname,tsex,tage,taddress);
        int updatetea = teacherServices.updatetea(teacher);
        System.out.println(updatetea);
        model.addAttribute("teacherlist",teacherServices.allteacher());
        return "main";
    }

}
