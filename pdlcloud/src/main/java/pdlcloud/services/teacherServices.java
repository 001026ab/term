package pdlcloud.services;

import pdlcloud.pojo.Teacher;

import java.util.List;

public interface teacherServices {

    List<Teacher> allteacher();

    int addTeacher(Teacher teacher);

    int delTeacher(String id);

    Teacher selectone(String id);

    int updatetea(Teacher teacher);



}
