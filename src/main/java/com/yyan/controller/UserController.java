package com.yyan.controller;

import com.yyan.pojo.User;
import com.yyan.serviceImpl.UserServiceImpl;
import com.yyan.utils.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserServiceImpl userService;

    /**
     * 批量添加用户
     */
    @RequestMapping("/role/insert")
    @ResponseBody
    public Map<String, Object> insertUser(@RequestBody Map<String, Object> map) {
        try {
            this.userService.insertListUserRole((List<User>) map.get("list"));
            return this.buildSuccess();
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }
    }

    /**
     * 批量查询用户
     */
    @RequestMapping("/role/select")
    @ResponseBody
    public Map<String, Object> selectUser(@RequestBody Map<String, Object> map) {
        try {
            return this.buildSuccess(this.userService.selectListUserRole(map));
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }
    }

    /**
     * 批量修改用户
     */
    @RequestMapping("/role/update")
    @ResponseBody
    public Map<String, Object> updateUser(@RequestBody Map<String, Object> map) {
        try {
            this.userService.updateListUserRole((List<User>) map.get("list"));
            return this.buildSuccess();
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }
    }


    /**
     * 批量删除用户
     */
    @RequestMapping("/role/delete")
    @ResponseBody
    public Map<String, Object> delete(@RequestBody Map<String, Object> map) {
        try {
            this.userService.deleteListUserRole((List<User>) map.get("list"));
            return this.buildSuccess();
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }
    }


}
