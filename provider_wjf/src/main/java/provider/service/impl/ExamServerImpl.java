package provider.service.impl;

import org.springframework.stereotype.Service;
import provider.dao.ExamDao;
import provider.model.ExamInfo;
import provider.service.ExamService;
import provider.utils.Result;

import javax.annotation.Resource;
import java.util.List;


@Service
public class ExamServerImpl implements ExamService {
    @Resource
    private ExamDao examDao;

    @Override
    public List<ExamInfo> findExam(String classNo) {
        return examDao.findExam(classNo);
    }
    @Override
    public List<ExamInfo> findAll(){
        return  examDao.findAll();
    }

    @Override
    public Result addExam(ExamInfo examInfo) {
        Result result = new Result(false,"没有操作数据库");

        Integer ret = examDao.insertExam(examInfo);
        if (ret >= 1) {
            result = new Result(true ,"考试记录添加成功");
        } else
            result = new Result(false ,"考试记录添加失败");
        return result;
    }



    @Override
    public Result updateExam(ExamInfo examInfo) {
        Result result = new Result(false, "没有操作数据库");
        Integer ret =examDao.updateExam(examInfo);
        if (ret >= 1)
            result = new Result(true, "考试记录更新成功");
        else
            result = new Result(false, "考试记录更新失败");
        return result;
    }

    @Override
    public Result deleteExam(Integer id) {
        Integer res = examDao.deleteExam(id);
        Result result = null;
        if (res <= 0)
            result = new Result(false, "考试记录删除失败");
        else
            result = new Result(true, "考试记录删除成功");
        return result;
    }

}
