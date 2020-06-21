package com.zsw.pingjiao.dao;

import com.zsw.pingjiao.pojo.Teacher;
import com.zsw.pingjiao.pojo.TeacherFenShu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface TeacherMapper {
    List<Teacher> getAll();
    Teacher getOne(Integer id);
    void insert(TeacherFenShu teacherFenShu);
    void update(Integer id);
}
