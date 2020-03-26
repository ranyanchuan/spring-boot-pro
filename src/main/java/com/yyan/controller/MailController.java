package com.yyan.controller;

import com.yyan.pojo.MailVo;
import com.yyan.serviceImpl.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@RestController
public class MailController {

    @Autowired
    private MailService mailService;

    /**
     * 发送邮件的主界面
     */
    @GetMapping("/mail/view")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("mail/sendMail");//打开发送邮件的页面
        mv.addObject("from", mailService.getMailSendFrom());//邮件发信人
        return mv;
    }

    /**
     * 发送邮件
     */
    @GetMapping("/mail/send")
    public MailVo sendMail() {

        MailVo mailVo = new MailVo();
        mailVo.setTo("ranych@yonyou.com");
        mailVo.setSubject("主题测试");
        mailVo.setText("邮件内容测试");

        return mailService.sendMail(mailVo);//发送邮件和附件

    }
}
