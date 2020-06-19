package lgmdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class studentinfo {

    private int studentNo;
    private String studentName;
    private String sex;
    private Date birthday;
    private String stdnative;
    private String classNo;
    private int stustatus;
    private String stuPart;

}
