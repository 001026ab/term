package xiuqin.springcloud.Controller;


import com.netflix.ribbon.proxy.annotation.Http;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xiuqin.springcloud.Service.studentService;
import xiuqin.springcloud.entities.CommonResult;
import xiuqin.springcloud.entities.Student;
import xiuqin.springcloud.entities.SupplyInfo;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@Controller    //1.创建ctrl类后要有RestController、Slf4j注解
@Slf4j
@RequestMapping("/zxq")
public class studentController {
    @Resource       //3.调用Service接口要有Resourse注解
    private studentService studentService;      //2.ctrl类要调用Service接口，先声明一个Service接口对象

    @RequestMapping("/main")
    public String returnMain(){
        return "main";
    }

    @ResponseBody
    //4.写一个result类的方法，方法名和参数最好和Dao方法对应一致
    @GetMapping(value = "/student/get/{studentNo}")     // 8.如果是“读”操作，要有GetMapping注解，value="/实体类名/自定义操作名/{参别名}"
    public CommonResult getStudentInfoById(@PathVariable("studentNo") int studentNo,HttpServletResponse response) {      //9.方法参数括号里，也要有PathVaRiable("参别名" ），并与上边注解的{参别名}一致，作用是在请求URL路径中可以输入请求参数
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        System.out.println(studentNo);
      Student result = studentService.getStudenInfoById(studentNo);     //5.service调用dao方法。返回和dao方法同类型的对象，这个方法在Dao层定义为student类的方法
        //6.日志出结果
//      Logger log = null;
//      log.info(studentNo + "号学生的信息是：" + result);
        System.out.println("学号："+studentNo+"查询结果是："+result);

        //7.结果分类处理
       if (result!=null){
           return new CommonResult(200,"查询数据成功",result);//如果成功，就构造new个result类对象传入数据封装,返回结果对象
       }else {
          return new CommonResult(444,"查询id:"+studentNo+"失败，没有记录",null);//如果失败，返回封装数据的result类对象，data为null
       }
    }

//基本信息跟新
    @ResponseBody
    @GetMapping("/student/update")     //update是又读又写，所以get/post注解都要，且都要写上url请求路径，别忘了
    @PostMapping("/student/update") //10.如果是“写”操作，就要用PostMapping（“/实体类名/操作名”）注解，不用{参数名}以及PathVariable注解
    public CommonResult update(Student student,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        int result=studentService.update(student);
        System.out.println("新插入结果数："+result);
        if(result>0){//应为返回的int型结果，so判断结果数是否大于0
            return new CommonResult(200,"更新数据成功",result);

        }else {
            return new CommonResult(444,"更新数据失败",null);
        }
    }

    //补录信息插入
//    @GetMapping("/SupplyInfo/supinsert")
    @ResponseBody
    @RequestMapping("/SupplyInfo/supinsert")
    public CommonResult insertSupply(@RequestBody SupplyInfo supplyInfo,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        System.out.println("INSERTSUPPLY");
//        SupplyInfo supplyInfo=new SupplyInfo(household,sid,birthplace,now_register,selfphone, mother_name,mother_call,father_name,father_call);
        System.out.println("supplinfo is :"+supplyInfo);
        int result = studentService.insertSupply(supplyInfo);
        System.out.println("********插入结果为："+result);
        if (result>0){  //成功
            return new CommonResult(200,"插入数据库成功",result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

        //根据id补录信息查询
    @ResponseBody
    @GetMapping(value = "/SupplyInfo/supget/{sid}")
    public CommonResult selectSupply(@PathVariable("sid") String sid, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        SupplyInfo supplyInfo;
        supplyInfo=studentService.selectFromSupply(sid);
        System.out.println("身份证号"+sid+"的补录信息是："+supplyInfo);
        if (supplyInfo!=null){
            return new CommonResult(200,"查询数据成功",supplyInfo);//如果成功，就构造new个result类对象传入数据封装,返回结果对象
        }else {
            return new CommonResult(444,"查询id:"+sid+"失败，没有记录",null);//如果失败，返回封装数据的result类对象，data为null
        }

    }
    @ResponseBody
    @RequestMapping("/SupplyInfo/modifySupplyInfo")
    public CommonResult modifySupplyInfo(String household, String sid, String birthplace, String now_register, String selfphone, String mother_name, String mother_call, String father_name, String father_call){
        SupplyInfo supplyInfo=new SupplyInfo(household,sid, birthplace, now_register,selfphone, mother_name, mother_call, father_name, father_call);
        CommonResult commonResult=studentService.updateSupply(supplyInfo);
        return commonResult;
    }

}
