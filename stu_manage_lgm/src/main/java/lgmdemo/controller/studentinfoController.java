package lgmdemo.controller;

import lgmdemo.pojo.studentinfo;
import lgmdemo.services.studentinfoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class studentinfoController {

    @Autowired
    studentinfoServices studentinfoServices;
//   初始化查看所有学生信息
    @RequestMapping("/lgm/allstu")
    public String allstu(Model model){
        model.addAttribute("stulist",studentinfoServices.allstu());
        return "main";
    }

//    跳转到添加学生信息的界面
    @RequestMapping("/lgm/add")
    public String add(){
        return "add";
    }

//    执行添加学生信息的操作
    @RequestMapping("/lgm/doadd")
    public String doadd(Model model, String studentNo, String studentName, String sex,
                        Date birthday, String stdnative, String classNo, String stustatus,
                        String stuPart){
//        System.out.println("控制器拿到的信息"+studentName+studentNo+sex+birthday+stdnative+classNo+stustatus+stuPart);
        int checkstatus = 0;//根据前端传过来的值，确定代表学生状态的数字
        if (stustatus.equals("在读")){checkstatus=0;}
        else if (stustatus.equals("休学")){checkstatus=1;}
        else{checkstatus=2;}
        studentinfo studentinfo = new studentinfo(Integer.parseInt(studentNo),studentName,sex,birthday,stdnative,classNo,checkstatus,stuPart);
       studentinfoServices.doadd(studentinfo);
        model.addAttribute("stulist",studentinfoServices.allstu());
        return "main";
    }


//    删除学生
    @RequestMapping("/lgm/delstu")
    public String delstu(String id,Model model){
        int a = Integer.parseInt(id.substring(1));
        studentinfoServices.delstu(a);
        model.addAttribute("stulist",studentinfoServices.allstu());
        return "main";
    }

    @RequestMapping("/lgm/update")
    public String upone(String id,Model model){
        studentinfo selectone = studentinfoServices.selectone(Integer.parseInt(id.substring(1)));
        model.addAttribute("stumes",selectone);
        return "update";
    }

    @RequestMapping("/lgm/doupdate")
    public String doupdate(Model model, String studentNo, String studentName, String sex,
                           Date birthday, String stdnative, String classNo, String stustatus,
                           String stuPart){

        int checkstatus = 0;//根据前端传过来的值，确定代表学生状态的数字
        if (stustatus.equals("在读")){checkstatus=0;}
        else if (stustatus.equals("休学")){checkstatus=1;}
        else{checkstatus=2;}
        studentinfo studentinfo = new studentinfo(Integer.parseInt(studentNo),studentName,sex,birthday,stdnative,classNo,checkstatus,stuPart);
        studentinfoServices.doupdate(studentinfo);
        model.addAttribute("stulist",studentinfoServices.allstu());

        return "main";
    }
}
