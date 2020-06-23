package wddemo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import wddemo.pojo.adminuser;

@Mapper
@Repository
public interface adminMapper {

//    查询数据库中是否存在当前用户
  adminuser selectone(String name, String pass);
}
