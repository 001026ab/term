package com.zxc.grades.service.impl;

import com.zxc.grades.dao.GradeDao;
import com.zxc.grades.model.Grade;
import com.zxc.grades.model.StudentInfo;
import com.zxc.grades.service.GradeService;
import com.zxc.grades.utils.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {
    @Resource
    private GradeDao gradeDao;


    @Override
    public List<Grade> queryAllStudentGrades(String className, String courseNo) {
        return gradeDao.queryAllStudentGrades(className,courseNo);
    }

    @Override
    public Result deleteOne(Integer studentNo,String courseNo,Integer score) {
        Result result;
        int ret;
        ret=gradeDao.deleteOne(studentNo,courseNo,score);
        if (ret>=1){
            return result=new Result(true,"删除 成功",null);
        }else{
            return result=new Result(false,"删除 失败",null);
        }

    }

    @Override
    public Result addGrade(Grade grade) {
        Result result;
        Integer ret = gradeDao.addGrade(grade);
        if (ret>=1){
            result=new Result(true,"成绩添加成功",null);
        }
        else{
            result=new Result(false,"成绩添加失败",null);
        }
        return result;

    }

    @Override
    public Result updateOne(Grade grade) {
        Result result;
        Integer ret = gradeDao.updateOne(grade);
        System.out.println(grade);
        System.out.println("ret="+ret);
        if (ret>=1){
            result=new Result(true,"成绩修改成功",null);
        }
        else{
            result=new Result(false,"成绩修改失败",null);
        }
        return result;

    }

    @Override
    public Grade findStudentInfo(Integer studentNo,String courseNo) {
        return gradeDao.selectOne(studentNo,courseNo);
    }

    @Override
    public StudentInfo queryStudentInfoByStudentNo(Integer studentNo) {
        return gradeDao.queryStudentInfoByStudentNo(studentNo);
    }
}
