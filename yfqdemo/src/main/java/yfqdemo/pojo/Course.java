package yfqdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    private  String cno;
    private  String  cname;
    private  String tname;
    private  Integer ctime;
}
