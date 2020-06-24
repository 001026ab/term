package provider.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import provider.model.ExamInfo;

import java.util.List;

@Mapper
@Repository
public interface ExamDao {
    public List<ExamInfo> findExam(String classNo);
    public List<ExamInfo> findExams();
    public Integer insertExam(ExamInfo examInfo);
    public Integer updateExam(ExamInfo examInfo);
    public Integer deleteExam(Integer id);
}
