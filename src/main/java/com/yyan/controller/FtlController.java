package com.yyan.controller;

import com.yyan.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FtlController {

    @RequestMapping("/showUser/ftl")
    //@ResponseBody  视图跳转不能用
    public String showUser(Model model) {

        System.out.println("xxxxxx");

        List<User> list = new ArrayList<>();
        list.add(new User("xiaoming", 1, 22));
        list.add(new User("xiaoming1", 2, 12));
        list.add(new User("xiaoming2", 3, 32));

        // 需要一个 model 对象
        model.addAttribute("listUser", list);
        // 跳转视图
        return "userListFtl";

    }
}
