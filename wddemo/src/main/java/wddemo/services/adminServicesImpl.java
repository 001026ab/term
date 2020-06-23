package wddemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wddemo.dao.adminMapper;
import wddemo.pojo.adminuser;

@Service
public class adminServicesImpl implements adminServices {

    @Autowired
    adminMapper adminMapper;

    @Override
    public adminuser selectone(String name, String pass) {
        return adminMapper.selectone(name,pass);
    }
}
