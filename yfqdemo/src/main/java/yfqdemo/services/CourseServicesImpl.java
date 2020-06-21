package yfqdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yfqdemo.dao.CourseMapper;
import yfqdemo.pojo.Course;

import java.util.List;

@Service
public class CourseServicesImpl implements CourseServices {

    @Autowired
    CourseMapper courseMapper;

    @Override
    public List<Course> allCourse() {
        return courseMapper.allCourse();
    }

    @Override
    public int doadd(Course course) {
        return courseMapper.doadd(course);
    }

    @Override
    public int delcourse(String id) {
        return courseMapper.delcourse(id);
    }

    @Override
    public Course selectone(String id) {
        return courseMapper.selectone(id);
    }

    @Override
    public int doupdate(Course course) {
        return courseMapper.doupdate(course);
    }
}
