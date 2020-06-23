package provider.service;

import provider.model.ExamInfo;
import provider.utils.Result;

import java.util.List;


public interface ExamService {
    public List<ExamInfo> findExam(String classNo);
    public Result addExam(ExamInfo examInfo);
    public Result updateExam(ExamInfo examInfo);
    public Result deleteExam(Integer id);
    public List<ExamInfo> findAll();
}
