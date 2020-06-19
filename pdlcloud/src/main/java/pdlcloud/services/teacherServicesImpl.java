package pdlcloud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pdlcloud.dao.teacherMapper;
import pdlcloud.pojo.Teacher;

import java.util.List;

@Service
public class teacherServicesImpl implements teacherServices {

    @Autowired
    teacherMapper teacherMapper;

    @Override
    public List<Teacher> allteacher() {
        return teacherMapper.allteacher();
    }

    @Override
    public int addTeacher(Teacher teacher) {
        return teacherMapper.addTeacher(teacher);
    }

    @Override
    public int delTeacher(String id) {
        System.out.println("删除方法执行");
        int i = teacherMapper.delTeacher(id);
        System.out.println(id);
        return i;
    }

    @Override
    public Teacher selectone(String id) {
        return teacherMapper.selectone(id);
    }

    @Override
    public int updatetea(Teacher teacher) {
        return teacherMapper.updatetea(teacher);
    }
}
