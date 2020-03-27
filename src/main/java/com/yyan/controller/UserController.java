package com.yyan.controller;

import com.yyan.pojo.User;
import com.yyan.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    // 页面跳转

    /**
     * @param page
     * @return
     * @PathVariable 获取url 路径中指定的值
     */
    @RequestMapping("/show/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }

    /**
     * 添加用户
     *
     * @Valid 开启对User要进行数据校验
     * BindingResult 校验结果
     */
    @RequestMapping("/add")
    @ResponseBody
    public String addUser(@Valid @RequestBody User user, BindingResult result) {

        System.out.println("xxxxxx"+user.getName()+result.hasErrors());
        if (!result.hasErrors()) { // 验证数据是否通过
            this.userService.addUser(user);
            return "success";
        }
        return result.toString();

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
