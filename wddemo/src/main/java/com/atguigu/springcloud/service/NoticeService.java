package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Notice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NoticeService {
    List<Notice> select();

    Notice selectOne(@Param("number") Integer number);

    int addNotice(Notice notice);

    void deleteNotice(@Param("number") Integer number);

    void modifyNotice(Notice notice);
}
