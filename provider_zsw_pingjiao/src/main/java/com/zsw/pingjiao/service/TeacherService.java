package com.zsw.pingjiao.service;

import com.zsw.pingjiao.pojo.Teacher;
import com.zsw.pingjiao.pojo.TeacherFenShu;

import java.util.List;

public interface TeacherService {
    public List<Teacher> getTeacherList();
    public Teacher findUserById(Integer id);
    public void save(TeacherFenShu teacherFenShu);
    public void update(Integer id);
}
