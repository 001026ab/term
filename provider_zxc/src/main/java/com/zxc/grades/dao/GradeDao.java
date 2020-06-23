package com.zxc.grades.dao;

import com.zxc.grades.model.Grade;
import com.zxc.grades.model.StudentInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GradeDao {
    public List<Grade> queryAllStudentGrades(String className,String courseNo);
    public Integer deleteOne(Integer studentNo,String courseNo,Integer score);
    public Integer addGrade(Grade grade);
    public Integer updateOne(Grade grade);
    public Grade selectOne(Integer studentNo,String courseNo);
    public StudentInfo queryStudentInfoByStudentNo(Integer studentNo);
}
