package xiuqin.springcloud.Service;

import org.apache.ibatis.annotations.Param;
import xiuqin.springcloud.entities.CommonResult;
import xiuqin.springcloud.entities.Student;
import xiuqin.springcloud.entities.SupplyInfo;

public interface studentService {//service接口，直接从Dao接口复制过来

    public int update(Student student);//传入STUDENT类的参数来修改
    public Student getStudenInfoById(@Param("studentNo")int studentNo);//按照int型的id来查询，起别名id，
    public int insertSupply(SupplyInfo supplyInfo);
    public CommonResult updateSupply(SupplyInfo supplyInfo);
    public SupplyInfo selectSupply(@Param("sid")String sid);
    public SupplyInfo selectFromSupply(String sid);

}
