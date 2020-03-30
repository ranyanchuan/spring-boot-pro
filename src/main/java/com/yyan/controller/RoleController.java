package com.yyan.controller;

import com.yyan.pojo.Role;
import com.yyan.serviceImpl.RoleServiceImpl;
import com.yyan.utils.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/role")
public class RoleController extends BaseController {
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
    public Map<String, Object> addUser(@Valid @RequestBody Role role, BindingResult result) {
        try {
            String uuid = this.roleService.addRole(role);
            // todo 查询本地添加的
            return this.buildSuccess(uuid);
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }
    }


    /**
     * 查询角色通过id
     */

    @RequestMapping("/query")
    @ResponseBody
    public Map<String, Object> queryInfo(@RequestParam String id) {
        try {
            Role role = this.roleService.getRoleById(id);
            return this.buildSuccess(role);
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }
    }


    /**
     * 查询角色通过id
     */

    @RequestMapping("/queryList")
    @ResponseBody
    public Map<String, Object> queryList(@RequestBody Map map) {

        try {
            List<Role> role = this.roleService.getAllRole(map);
            return this.buildSuccess(role);
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }

    }



}
