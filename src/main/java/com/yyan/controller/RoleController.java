package com.yyan.controller;

import com.yyan.pojo.Role;
import com.yyan.serviceImpl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleServiceImpl roleService;

    /**
     * 添加角色
     *
     * @Valid 开启对角色要进行数据校验
     * BindingResult 校验结果
     */
    @RequestMapping("/add")
    @ResponseBody
    public String addUser(@Valid @RequestBody Role role, BindingResult result) {


        if (!result.hasErrors()) { // 验证数据是否通过
            this.roleService.addRole(role);
            return "success";
        }
        return result.toString();

    }


}
