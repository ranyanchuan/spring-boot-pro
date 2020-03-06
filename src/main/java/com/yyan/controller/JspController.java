package com.yyan.controller;

import com.yyan.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * springboot 整合 jsp
 */

@Controller
public class JspController {

    @RequestMapping("/showUser")
    //@ResponseBody  视图跳转不能用
    public String showUser(Model model) {

        List<User> list = new ArrayList<>();
        list.add(new User("xiaoming", 1, 22));
        list.add(new User("xiaoming1", 2, 12));
        list.add(new User("xiaoming2", 3, 32));

        // 需要一个 model 对象
        model.addAttribute("list", list);
        // 跳转视图
        return "userList";

    }


}
