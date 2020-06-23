package com.zxc.grades.utils;

import com.zxc.grades.model.StudentInfo;

public class Result {
    private Boolean success;
    private String message;

    public StudentInfo getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }

    private StudentInfo studentInfo;

    public Result() {
    }

    public Result(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }
    public Result(Boolean success, String message,StudentInfo studentInfo) {
        this.success = success;
        this.message = message;
        this.studentInfo = studentInfo;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", studentInfo=" + studentInfo +
                '}';
    }
}
