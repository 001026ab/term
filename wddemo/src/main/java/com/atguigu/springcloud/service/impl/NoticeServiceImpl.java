package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.NoticeDao;
import com.atguigu.springcloud.entities.Notice;
import com.atguigu.springcloud.service.NoticeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class NoticeServiceImpl implements NoticeService {

    @Resource
    private NoticeDao noticeDao;

    @Override
    public List<Notice> select() {
        return noticeDao.select();
    }

    @Override
    public Notice selectOne(Integer number) {
        return noticeDao.selectOne(number);
    }

    @Override
    public int addNotice(Notice notice) {
        return noticeDao.addNotice(notice);
    }

    @Override
    public void deleteNotice(Integer number) {
        log.info("number2=" + number);
        noticeDao.deleteNotice(number);
    }

    @Override
    public void modifyNotice(Notice notice) {
        noticeDao.modifyNotice(notice);
    }

}
