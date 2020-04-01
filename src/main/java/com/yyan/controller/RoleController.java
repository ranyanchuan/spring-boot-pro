//package com.yyan.controller;
//
//import com.yyan.pojo.Role;
//import com.yyan.serviceImpl.RoleServiceImpl;
//import com.yyan.utils.BaseController;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import javax.validation.Valid;
//import java.util.Map;
//
//@Controller
//@RequestMapping("/role")
//public class RoleController extends BaseController {
//    @Autowired
//    private RoleServiceImpl roleService;
//
//    /**
//     * 添加角色
//     *
//     * @Valid 开启对角色要进行数据校验
//     * BindingResult 校验结果
//     */
//    @RequestMapping("/add")
//    @ResponseBody
//    public Map<String, Object> addRole(@Valid @RequestBody Role role, BindingResult result) {
//        try {
//            Role data = this.roleService.addRole(role);
//            return this.buildSuccess(data);
//        } catch (Exception exp) {
//            return this.buildError(exp.getMessage());
//        }
//    }
//
//
//    /**
//     * 查询角色通过id
//     */
//    @RequestMapping("/query")
//    @ResponseBody
//    public Map<String, Object> queryInfo(@RequestParam String id) {
//        try {
//            Role data = this.roleService.getRoleById(id);
//            return this.buildSuccess(data);
//        } catch (Exception exp) {
//            return this.buildError(exp.getMessage());
//        }
//    }
//
//
//    /**
//     * 查询角色通过id
//     */
//    @RequestMapping("/queryList")
//    @ResponseBody
//    public Map<String, Object> queryList(@RequestBody Map param) {
//        try {
//            Map<String, Object> data = this.roleService.getAllRole(param);
//            return this.buildSuccess(data);
//        } catch (Exception exp) {
//            return this.buildError(exp.getMessage());
//        }
//
//    }
//
//    /**
//     * 删除角色通过id
//     */
//    @RequestMapping("/delete")
//    @ResponseBody
//    public Map<String, Object> delete(@RequestParam String id) {
//        try {
//            this.roleService.deleteRole(id);
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
//    public Map<String, Object> update(@RequestBody Role role) {
//        try {
//            this.roleService.updateRole(role);
//            return this.buildSuccess(role);
//        } catch (Exception exp) {
//            return this.buildError(exp.getMessage());
//        }
//
//    }
//
//
//}
