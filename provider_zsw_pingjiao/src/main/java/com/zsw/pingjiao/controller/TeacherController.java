package com.zsw.pingjiao.controller;

import com.zsw.pingjiao.pojo.Teacher;
import com.zsw.pingjiao.pojo.TeacherFenShu;
import com.zsw.pingjiao.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 教师控制类
 *
 * @author DOUBLE WEI
 * @create 2020--06--07--13:53
 */
@Controller
public class TeacherController {
    @Resource
    TeacherService teacherService;

    @RequestMapping("/")
    public String index() {

        return "redirect:/main";
    }

    @RequestMapping("/main")
    public String list(Model model) {
        List<Teacher> teacheres=teacherService.getTeacherList();
        model.addAttribute("teacheres", teacheres);
        return "teacher/main";
    }

    @RequestMapping("/topj")
    public String pj(Model model,Integer id) {
        Teacher teacher=teacherService.findUserById(id);
        model.addAttribute("teacher", teacher);
        return "teacher/pingjiaoshi";
    }

    @RequestMapping("/add")
    public String add(TeacherFenShu teacherFenShu,Integer id) {
        teacherService.save(teacherFenShu);
        teacherService.update(id);
        return "redirect:/main";
    }
}
