package lgmdemo.services;

import lgmdemo.pojo.studentinfo;

import java.util.List;

public interface studentinfoServices {
    List<studentinfo> allstu();

    int doadd(studentinfo studentinfo);

    int delstu(int id);

    studentinfo selectone(int id);

    int doupdate(studentinfo studentinfo);


}
