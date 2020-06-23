package com.zxc.grades.controller;

import com.zxc.grades.model.Grade;
import com.zxc.grades.model.StudentInfo;
import com.zxc.grades.service.GradeService;
import com.zxc.grades.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @RequestMapping("/grade/index")
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/grade/showAllStudentGrades")
    public List<Grade> getAllStudentGrades(String className,String courseNo){
//        response.setHeader("Access-Control-Allow-Origin", "*");
//        response.setHeader("Cache-Control","no-cache");HttpServletResponse response
        System.out.println("showallgrades succes1");
        return gradeService.queryAllStudentGrades(className,courseNo);
    }
    @ResponseBody
    @RequestMapping("/grade/findOne")
    public StudentInfo findOne(Integer studentNo,String courseNo){
            StudentInfo studentInfo=new StudentInfo();
            Grade grade=new Grade();
            grade.setCourseNo(courseNo);
            if(studentNo<=0){
                studentInfo=new StudentInfo(-1L,"输入数据出错");
            }
            else{
                studentInfo=gradeService.queryStudentInfoByStudentNo(studentNo);
                studentInfo.setGrade(grade);
            }
            return studentInfo;
    }
    @ResponseBody
    @RequestMapping("/grade/deleteOne")
    public Result deleteOne(Integer studentNo,String courseNo,Integer score){
        Result result;
        return result=gradeService.deleteOne(studentNo,courseNo,score);
    }
    @ResponseBody
    @RequestMapping("/grade/save")
    public Result addGrade(@RequestBody StudentInfo studentInfo,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        System.out.println(studentInfo.getGrade());
        Grade grade= new Grade();
        grade.setStudentNo(studentInfo.getStudentNo());
        grade.setCourseNo(studentInfo.getGrade().getCourseNo());
        grade.setScore(studentInfo.getGrade().getScore());
        grade.setTerm("1");
        Result result=null;
        if (studentInfo!=null&&studentInfo.getStudentNo()!=null&&studentInfo.getStudentNo()>0){
            result=gradeService.addGrade(grade);
        }else{
            result=gradeService.addGrade(grade);
        }
        return result;
    }
    @ResponseBody
    @RequestMapping("/grade/updateOne")
    public Result updateOne(@RequestBody StudentInfo studentInfo){
        Grade grade=studentInfo.getGrade();
        grade.setStudentNo(studentInfo.getStudentNo());
        return gradeService.updateOne(grade);

    }


}
