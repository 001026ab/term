package yfqdemo.services;

import yfqdemo.pojo.Course;

import java.util.List;

public interface CourseServices {
    List<Course> allCourse();

    int doadd(Course course);

    int delcourse(String id);

    Course selectone(String id);

    int doupdate(Course course);
}
