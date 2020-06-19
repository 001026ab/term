package lgmdemo.services;

import lgmdemo.dao.studentinfoMapper;
import lgmdemo.pojo.studentinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class studentinfoServicesImpl implements studentinfoServices {


    @Autowired
    studentinfoMapper studentinfoMapper;

    @Override
    public List<studentinfo> allstu() {
        return studentinfoMapper.allstu();
    }

    @Override
    public int doadd(studentinfo studentinfo) {
        return studentinfoMapper.doadd(studentinfo);
    }

    @Override
    public int delstu(int id) {
        return studentinfoMapper.delstu(id);
    }

    @Override
    public studentinfo selectone(int id) {
        return studentinfoMapper.selectone(id);
    }

    @Override
    public int doupdate(studentinfo studentinfo) {
        return studentinfoMapper.doupdate(studentinfo);
    }
}
