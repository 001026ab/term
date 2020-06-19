package pdlcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import pdlcloud.pojo.Teacher;

import java.util.List;

@Mapper
@Repository
public interface teacherMapper {
//    查看所有老师信息
    List<Teacher> allteacher();

//    新增教师
    int addTeacher(Teacher teacher);

//    删除指定教师
    int delTeacher(@Param("id") String id);

//    查询某个老师
    Teacher selectone(String id);


//    更新教师
    int updatetea(Teacher teacher);

}
