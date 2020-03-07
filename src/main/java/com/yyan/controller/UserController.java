package com.yyan.controller;

import com.yyan.pojo.User;
import com.yyan.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
     * 添加用户
     */
    @RequestMapping("/add")
    public String addUser(User user) {
        this.userService.addUser(user);
        return "success";
    }

    /**
     * 查询所有用户
     */

    @RequestMapping("/getAll")
    @ResponseBody
    public List<User> getAll() {
        return this.userService.getAll();
    }


    /**
     * 查询所有用户
     */

    @RequestMapping("/query")
    @ResponseBody
    public User queryInfo(Integer id) {
        return this.userService.getUserById(id);
    }

    /**
     * 查询所有用户
     */

    @RequestMapping("/update")
    @ResponseBody
    public String update(User user) {
        this.userService.updateUser(user);
        return "success";
    }

    /**
     * 删除用户
     */

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(Integer id) {
        this.userService.deleteUser(id);
        return "success";
    }


}
