package xiuqin.springcloud.entities;

import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
public class SupplyInfo implements Serializable {

    private String household;
    private String sid;
    private String birthplace;
    private String now_register;
    private String selfphone;
    private String mother_name;
    private String mother_call;
    private String father_name;
    private String father_call;

    public SupplyInfo() {
    }

    public SupplyInfo(String household, String sid, String birthplace, String now_register, String selfphone, String mother_name, String mother_call, String father_name, String father_call) {
        this.household = household;
        this.sid = sid;
        this.birthplace = birthplace;
        this.now_register = now_register;
        this.selfphone = selfphone;
        this.mother_name = mother_name;
        this.mother_call = mother_call;
        this.father_name = father_name;
        this.father_call = father_call;
    }

    @Override
    public String toString() {
        return "SupplyInfo{" +
                ", household='" + household + '\'' +
                ", sid=" + sid +
                ", birthplace='" + birthplace + '\'' +
                ", now_register='" + now_register + '\'' +
                ", selfphone=" + selfphone +
                ", mother_name='" + mother_name + '\'' +
                ", mother_call=" + mother_call +
                ", father_name='" + father_name + '\'' +
                ", father_call=" + father_call +
                '}';
    }
}
