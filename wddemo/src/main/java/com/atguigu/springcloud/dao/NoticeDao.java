package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NoticeDao {
    List<Notice> select();

    Notice selectOne(@Param("number") Integer number);

    int addNotice(Notice notice);

    void deleteNotice(@Param("number") Integer number);

    void modifyNotice(Notice notice);

}
