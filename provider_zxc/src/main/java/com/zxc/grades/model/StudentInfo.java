package com.zxc.grades.model;

import java.util.Date;

public class StudentInfo {
//      `studentNo` int(10) NOT NULL,
//  `studentName` varchar(30) COLLATE utf8_bin NOT NULL,
//  `sex` varchar(5) COLLATE utf8_bin NOT NULL,
//  `birthday` date NOT NULL,
//            `stdnative` varchar(30) COLLATE utf8_bin NOT NULL,
//  `classNo` varchar(30) COLLATE utf8_bin NOT NULL,
//  `stustatus` int(5) NOT NULL,
//  `stuPart` varchar(40) COLLATE utf8_bin DEFAULT NULL,
        private Long studentNo;
        private String studentName;
        private String sex;
        private Date birthday;
        private String classNo;
        private String stustatus;
        private String stuPart;

        private Grade studentGrade;

    public StudentInfo() {
    }
    public StudentInfo(Long studentNo, String studentName){
        this.studentNo=studentNo;
        this.studentName=studentName;
    }
    public StudentInfo(Long studentNo, String studentName, String sex, Date birthday, String classNo, String stustatus, String stuPart, Grade studentGrade) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.sex = sex;
        this.birthday = birthday;
        this.classNo = classNo;
        this.stustatus = stustatus;
        this.stuPart = stuPart;
        this.studentGrade = studentGrade;
    }

    public Long getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Long studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getStustatus() {
        return stustatus;
    }

    public void setStustatus(String stustatus) {
        this.stustatus = stustatus;
    }

    public String getStuPart() {
        return stuPart;
    }

    public void setStuPart(String stuPart) {
        this.stuPart = stuPart;
    }

    public Grade getGrade() {
        return studentGrade;
    }

    public void setGrade(Grade studentGrade) {
        this.studentGrade = studentGrade;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "studentNo=" + studentNo +
                ", studentName='" + studentName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", classNo='" + classNo + '\'' +
                ", stustatus='" + stustatus + '\'' +
                ", stuPart='" + stuPart + '\'' +
                ", grade=" + studentGrade +
                '}';
    }
}

