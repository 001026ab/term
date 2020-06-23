package com.zxc.grades.model;

public class Grade {
    private long studentNo;
    private String courseNo;
    private String term;
    private long score;

    public Grade() {
    }
    public Grade(long studentNo, String courseNo) {
        this.studentNo = studentNo;
        this.courseNo = courseNo;
    }
    public Grade(long studentNo, String courseNo, String term, long score) {
        this.studentNo = studentNo;
        this.courseNo = courseNo;
        this.term = term;
        this.score = score;
    }

    public long getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(long studentNo) {
        this.studentNo = studentNo;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long grade) {
        this.score = grade;
    }

    @Override
    public String toString() {
        return "grade{" +
                "学生学号:" + studentNo +
                ", 课程号:'" + courseNo + '\'' +
                ", 学期:'" + term + '\'' +
                ", 分数:" + score +
                '}';
    }
}
