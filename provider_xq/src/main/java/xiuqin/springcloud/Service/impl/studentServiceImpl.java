package xiuqin.springcloud.Service.impl;

import org.springframework.stereotype.Service;
import xiuqin.springcloud.Dao.studentDao;
import xiuqin.springcloud.Service.studentService;
import xiuqin.springcloud.entities.CommonResult;
import xiuqin.springcloud.entities.Student;
import xiuqin.springcloud.entities.SupplyInfo;

import javax.annotation.Resource;

@Service    //1.service实现类，上面要有Service注解
public class studentServiceImpl  implements studentService {    //2.实现Service接口，重写方法
    @Resource   //4.调用Dao后要有Resourse或autowired注解
    private studentDao studentDao;//3.service实现类要调用Dao接口，先声明个对象

    @Override
    public int update(Student student) {
        return studentDao.update(student);//5.Dao接口调用Dao层相应方法,并返回
    }

    @Override
    public Student getStudenInfoById(int studentNo) {
        return studentDao.getStudenInfoById(studentNo);
    }

    @Override
    public int insertSupply(SupplyInfo supplyInfo) {
        return studentDao.insertSupply(supplyInfo);
    }

    @Override
    public CommonResult updateSupply(SupplyInfo supplyInfo) {
        int iret;
        CommonResult commonResult=null;
        iret = studentDao.updateSupply(supplyInfo);
        if(iret>=1){
            commonResult = new CommonResult<SupplyInfo>(200,"数据更新成功",null);
        }else{
            commonResult = new CommonResult<SupplyInfo>(400,"数据更新失败",null);
        }
        return commonResult;
    }

    @Override
    public SupplyInfo selectSupply(String sid) {
        return studentDao.selectSupply(sid);
    }

    @Override
    public SupplyInfo selectFromSupply(String sid) {
        return studentDao.selectFromSupply(sid);
    }
}
