package com.zxc.grades.service;

import com.zxc.grades.model.Grade;
import com.zxc.grades.model.StudentInfo;
import com.zxc.grades.utils.Result;

import java.util.List;

public interface GradeService {

    public List<Grade> queryAllStudentGrades(String className,String courseNo);
    public Result deleteOne(Integer studentNo,String courseNo,Integer score);
    public Result addGrade(Grade grade);
    public Result updateOne(Grade grade);
    public Grade findStudentInfo(Integer studentNo,String courseNo);
    public StudentInfo queryStudentInfoByStudentNo(Integer studentNo);
}
