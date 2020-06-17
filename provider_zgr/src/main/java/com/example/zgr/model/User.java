package com.example.zgr.model;

public class User {
    private int id;
    private  String t_number;
    private  String t_name;
    private  String t_type;
    private  String t_exalp;
    private  String t_approve;
    private  String t_reason;

    public String getT_exalp() {
        return t_exalp;
    }

    public void setT_exalp(String t_exalp) {
        this.t_exalp = t_exalp;
    }

    public String getT_reason() {
        return t_reason;
    }

    public void setT_reason(String t_reason) {
        this.t_reason = t_reason;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getT_number() {
        return t_number;
    }

    public void setT_number(String t_number) {
        this.t_number = t_number;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getT_type() {
        return t_type;
    }

    public void setT_type(String t_type) {
        this.t_type = t_type;
    }


    public String getT_approve() {
        return t_approve;
    }

    public void setT_approve(String t_approve) {
        this.t_approve = t_approve;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", t_number='" + t_number + '\'' +
                ", t_name='" + t_name + '\'' +
                ", t_type='" + t_type + '\'' +
                ", t_exalp='" + t_exalp + '\'' +
                ", t_approve='" + t_approve + '\'' +
                ", t_reason='" + t_reason + '\'' +
                '}';
    }
}
