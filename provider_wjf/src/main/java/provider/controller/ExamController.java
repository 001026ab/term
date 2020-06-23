package provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import provider.model.ExamInfo;
import provider.service.ExamService;
import provider.utils.Result;

import java.util.List;

@RestController
@RequestMapping("/exam")
public class ExamController {



    @Autowired
    private ExamService examService;




    @RequestMapping("/addexam")

    public Result examadd(ExamInfo examInfo) {
        Result result = null;
        examInfo=new ExamInfo(null,"55","55","55","55","55");
        System.out.println(examInfo.getClassNo());
        result = examService.addExam(examInfo);
        return result;
    }

    @RequestMapping("/updateexam")
    public Result examupdate(ExamInfo examInfo) {
        examInfo=new ExamInfo(5,"66","66","66","66","66");
        Result result = null;
        result = examService.updateExam(examInfo);
        return result;
    }

    @RequestMapping("/findexam")
    public List<ExamInfo> findexam(String classNo) {

        return  examService.findExam( classNo);
    }


    @RequestMapping("/findall")
    public List<ExamInfo> findall() {

        return  examService.findAll();
    }

    @RequestMapping("/deleteexam")
    public Result deleteexam(Integer id) {
        Result result = null;
        if (id <= 0)
            result = new Result(false, "请输入正确的id");
        else {
            result = examService.deleteExam(id);
        }
        return result;
    }

}
