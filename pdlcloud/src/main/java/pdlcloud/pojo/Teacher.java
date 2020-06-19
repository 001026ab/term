package pdlcloud.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private  String tid;
    private  String tname;
    private  String tsex;
    private int tage;
    private  String taddress;
}
