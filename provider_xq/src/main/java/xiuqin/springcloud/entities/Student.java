package xiuqin.springcloud.entities;
//entities包用来存放实体类

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data       //类的前面加上@Data注解，这样一来，这个实体类中的属性就不需要get和set方法
@AllArgsConstructor         //全参
@NoArgsConstructor          //空参

public class Student implements Serializable {      //实现序列化接口，后序分布式部署会用到
    //声明字段，（数据库Id是bigint就用Long型）
    private int studentNo;
    private String studentName;
    private String sex;
    private String birthday;
    private String stdnative;
    private String classNo;
    private int stustatus;
    private String stuPart;
    private SupplyInfo supplyInfo;


//    public int getStustatus() {
//        return stustatus;
//    }
//
//    public void setStustatus(int stustatus) {
//        this.stustatus = stustatus;
//    }
//
//
//
//
//    public int getStudentNo() {
//        return studentNo;
//    }
//
//    public void setStudentNo(int studentNo) {
//        this.studentNo = studentNo;
//    }
//
//    public String getStudentName() {
//        return studentName;
//    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    public String getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(String birthday) {
//        this.birthday = birthday;
//    }
//
//    public String getStdnative() {
//        return stdnative;
//    }
//
//    public void setStdnative(String stdnative) {
//        this.stdnative = stdnative;
//    }
//
//    public String getClassNo() {
//        return classNo;
//    }
//
//    public void setClassNo(String classNo) {
//        this.classNo = classNo;
//    }
}
