package com.yyan.controller;

import com.yyan.pojo.User;
import com.yyan.pojo.UserRole;
import com.yyan.serviceImpl.UserRoleServiceImpl;
import com.yyan.serviceImpl.UserServiceImpl;
import com.yyan.utils.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @RequestMapping("/insert")
    @ResponseBody
    public Map<String, Object> insertUser(@RequestBody Map<String, Object> map) {
        try {
            this.userService.insertListUser((List<User>) map.get("list"));
            return this.buildSuccess();
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }
    }

    /**
     * 批量查询用户
     */
    @RequestMapping("/select")
    @ResponseBody
    public Map<String, Object> selectUser(@RequestBody Map<String, Object> map) {
        try {
            return this.buildSuccess(this.userService.selectListUser(map));
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }
    }


    /**
     * 批量修改用户
     */
    @RequestMapping("/update")
    @ResponseBody
    public Map<String, Object> updateUser(@RequestBody Map<String, Object> map) {
        try {
            this.userService.updateListUser((List<User>) map.get("list"));
            return this.buildSuccess();
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }
    }



//    /**
//     * 添加用户
//     */
//    @RequestMapping("/add")
//    @ResponseBody
//    public Map<String, Object> addUser(@RequestParam List<User> list) {
//        try {
//            this.userService.insertListUser(list);
//            return this.buildSuccess();
//        } catch (Exception exp) {
//            return this.buildError(exp.getMessage());
//        }
//    }
//
//    /**
//     * 添加用户角色
//     */
//    @RequestMapping("/addRole")
//    @ResponseBody
//    public Map<String, Object> addUser(@RequestBody UserRole userRole) {
//        try {
//            Map<String, Object> data = this.userRoleService.addUserRole(userRole);
//            return this.buildSuccess(data);
//        } catch (Exception exp) {
//            return this.buildError(exp.getMessage());
//        }
//    }
//
//    /**
//     * 查询角色通过id
//     */
//    @RequestMapping("/queryList")
//    @ResponseBody
//    public Map<String, Object> queryList(@RequestBody Map param) {
//        try {
//            Map<String, Object> data = this.userService.getAllUser(param);
//            return this.buildSuccess(data);
//        } catch (Exception exp) {
//            return this.buildError(exp.getMessage());
//        }
//    }


//    /**
//     * 添加用户角色
//     */
//    @RequestMapping("/queryUserRoleList")
//    @ResponseBody
//    public Map<String, Object> queryUserRoleList(@RequestBody Map param) {
//        try {
//            Map<String, Object> data = this.userService.getQueryUserRoleList(param);
////            BeanUtil.copyProperties(ee1, user);
//
//            return this.buildSuccess(data);
//        } catch (Exception exp) {
//            System.out.println(exp.toString());
//            return this.buildError(exp.getMessage());
//        }
//    }
//
//
//    /**
//     * 删除角色通过id
//     */
//    @RequestMapping("/delete")
//    @ResponseBody
//    public Map<String, Object> delete(@RequestParam String id) {
//        try {
//            this.userService.deleteUser(id);
//            return this.buildSuccess();
//        } catch (Exception exp) {
//            return this.buildError(exp.getMessage());
//        }
//    }
//
//
//    /**
//     * 查询角色通过id
//     */
//    @RequestMapping("/update")
//    @ResponseBody
//    public Map<String, Object> update(@RequestBody User user) {
//        try {
//            this.userService.updateUser(user);
//            return this.buildSuccess();
//        } catch (Exception exp) {
//            return this.buildError(exp.getMessage());
//        }
//
//    }


}
