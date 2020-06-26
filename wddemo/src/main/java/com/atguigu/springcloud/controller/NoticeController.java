package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Notice;
import com.atguigu.springcloud.service.NoticeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

@Controller
@Slf4j
public class NoticeController {

    @Autowired
    NoticeService noticeService;

    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    //查询公告
    @RequestMapping("/wd/notices")
    public String list(Model model) {
        Collection<Notice> notices = noticeService.select();
        model.addAttribute("notices", notices);
        return "list";
    }

    //来到添加页面
    @RequestMapping("/wd/add")
    public String toAddPage() {
        return "add";
    }

    //添加
    @RequestMapping("/wd/addNotice")
    public String addNotice(Notice notice, BindingResult bindingResult, HttpServletRequest request) throws ParseException {

        String time = request.getParameter("time");
        Date date = sdf.parse(time);
        notice.setTime(date);
        boolean flag = noticeService.addNotice(notice) > 0;
        return "redirect:notices";
    }

    //删除
    @RequestMapping("/wd/deleteNotice")
    public String deleteNotice(@Param("number") Integer number) {
        log.info("number1=" + number);
        noticeService.deleteNotice(number);
        return "redirect:notices";
    }

    //来到修改页面
    @RequestMapping("/wd/modify")
    public String toModifyPage(@Param("number") Integer number, Model model) {
        Notice notice = noticeService.selectOne(number);
        model.addAttribute("notice", notice);
        return "modify";
    }

    //修改
    @RequestMapping("/wd/modifyNotice")
    public String modifyNotice(Notice notice, BindingResult bindingResult, HttpServletRequest request) throws ParseException {
        String time = request.getParameter("time");
        Date date = sdf.parse(time);
        notice.setTime(date);
        noticeService.modifyNotice(notice);
        return "redirect:notices";
    }

    //学生查询公告
    @RequestMapping("/wd/stuNotices")
    public String stuNotices(Model model) {
        Collection<Notice> notices = noticeService.select();
        model.addAttribute("notices", notices);
        return "stuindex";
    }

}
