package xiuqin.springcloud.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xiuqin.springcloud.entities.Student;
import xiuqin.springcloud.entities.SupplyInfo;

@Mapper     //Dao层最好用Mapper注解
public interface studentDao {
    public int update(Student student);//传入STUDENT类的参数来创建增加
    public Student getStudenInfoById(int studentNo);//按照int型的id来查询，起别名id，
    public int insertSupply(SupplyInfo supplyInfo);
    public int updateSupply(SupplyInfo supplyInfo);
    public SupplyInfo selectSupply(String sid);
    public SupplyInfo selectFromSupply(String sid);
}
