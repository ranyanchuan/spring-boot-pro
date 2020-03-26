package com.yyan.controller;

import com.yyan.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * springboot 整合 thymeleaf
 */

@Controller
public class ThyController {

    @RequestMapping("/showUser/thy")
    public String showUser(HttpServletRequest request, Model model) {

        //  集合
//        List<User> list = new ArrayList<>();
//        list.add(new User("xiaoming", 1, 22,"xt20110702@163.com"));
//        list.add(new User("xiaoming1", 2, 12,"xt20110702@163.com"));
//        list.add(new User("xiaoming2", 3, 32,"xt20110702@163.com"));
//
//        //  map
//        Map<String, User> map = new HashMap<>();
//        map.put("u1", new User("xiaoming", 1, 12,"xt20110702@163.com"));
//        map.put("u2", new User("xiaoming", 2, 22,"xt20110702@163.com"));
//        map.put("u3", new User("xiaoming", 3, 32,"xt20110702@163.com"));
//
//
//        model.addAttribute("msg", "springboot 整合 thymeleaf");
//        model.addAttribute("date", new Date());
//        model.addAttribute("gender", "男");
//        model.addAttribute("list", list);
//        model.addAttribute("map", map);
//
//        request.setAttribute("req", "HttpServletRequest");
//        //  没有验证成功¬
        //  request.getSession().setAttribute("sess", "HttpSession");
        //  request.getSession().getServletContext().setAttribute("app", "Application");

        return "userListThy";
    }
}
