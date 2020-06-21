package yfqdemo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import yfqdemo.pojo.Course;

import java.util.List;

@Mapper
@Repository
public interface CourseMapper {
//    查看所有的课程信息
    List<Course> allCourse();

//    添加课程
    int doadd(Course course);

//    删除课程
    int delcourse(String id);

//    查询出要修改的单条课程的详细信息
    Course selectone(String id);

//    更新课程信息
    int doupdate(Course course);
}
