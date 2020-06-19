package lgmdemo.dao;

import lgmdemo.pojo.studentinfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface studentinfoMapper {
//    查看所有的学生信息
    List<studentinfo> allstu();

//    增加一个学生的信息
    int doadd(studentinfo studentinfo);

//    删除一个学生
    int delstu(int id);

//    查询出要修改的学生的信息
    studentinfo selectone(int id);

//    修改学生信息
    int doupdate(studentinfo studentinfo);
}
