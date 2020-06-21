package com.zsw.pingjiao.service.impl;

import com.zsw.pingjiao.dao.TeacherMapper;
import com.zsw.pingjiao.pojo.Teacher;
import com.zsw.pingjiao.pojo.TeacherFenShu;
import com.zsw.pingjiao.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 教师实现类
 *
 * @author DOUBLE WEI
 * @create 2020--06--07--13:50
 */
@Service
public class TeacherServiceImp implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> getTeacherList() {
        return teacherMapper.getAll();
    }

    @Override
    public Teacher findUserById(Integer id) {
        return teacherMapper.getOne(id);
    }

    @Override
    public void save(TeacherFenShu teacherFenShu) {
        teacherMapper.insert(teacherFenShu);
    }

    @Override
    public void update(Integer id) {
        teacherMapper.update(id);
    }
}

