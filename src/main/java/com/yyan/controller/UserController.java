package com.yyan.controller;

import com.yyan.pojo.User;
import com.yyan.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    // 页面跳转
    @RequestMapping("/show/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }

    /**
     *
     */
    @RequestMapping("/addUser")
    public String addUser(User user) {

        this.userService.addUser(user);
        return "success";
    }


}
