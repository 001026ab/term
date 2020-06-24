package xiuqin.springcloud.entities;
//这是个json封装体，通用的结果集处理。方便前后端交接，
import com.sun.org.apache.xpath.internal.objects.XNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data        //类的前面加上@Data注解，这样一来，这个实体类中的属性就不需要get和set方法
//@AllArgsConstructor
//@NoArgsConstructor
@Builder    //还是用Buidlder注解吧，+手动get/set方法+手动构造方法
public class CommonResult<T>{//这是个通用的结果集处理，所以用到泛型，如果封装的是payment类，T就是payment，如果封装的是其他类，T就是其他类
//一种结果是出现错误：通常的错误是404，not found，一般会返回错误代码，和错误信息/成功信息
    //封装结果编码和结果信息，以及T类的数据
    private int code;
    private String msg;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public CommonResult() {
    }

    public CommonResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}



