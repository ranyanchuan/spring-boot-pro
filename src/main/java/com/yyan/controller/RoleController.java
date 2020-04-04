package com.yyan.controller;

import com.yyan.pojo.Role;
import com.yyan.pojo.RoleMenu;
import com.yyan.serviceImpl.RoleServiceImpl;
import com.yyan.utils.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/role")
public class RoleController extends BaseController {


    @Autowired
    private RoleServiceImpl roleService;

    /**
     * 批量添加角色
     */
    @RequestMapping("/insert")
    @ResponseBody
    public Map<String, Object> insertRole(@RequestBody Map<String, Object> map) {
        try {
            this.roleService.insertListRole((List<Role>) map.get("list"));
            return this.buildSuccess();
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }
    }

    /**
     * 批量查询角色
     */
    @RequestMapping("/select")
    @ResponseBody
    public Map<String, Object> selectRole(@RequestBody Map<String, Object> map) {
        try {
            return this.buildSuccess(this.roleService.selectListRole(map));
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }
    }


    /**
     * 批量修改角色
     */
    @RequestMapping("/update")
    @ResponseBody
    public Map<String, Object> updateRole(@RequestBody Map<String, Object> map) {
        try {
            this.roleService.updateListRole((List<Role>) map.get("list"));
            return this.buildSuccess();
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }
    }

    /**
     * 批量删除角色
     */
    @RequestMapping("/delete")
    @ResponseBody
    public Map<String, Object> delete(@RequestBody Map<String, Object> map) {
        try {
            this.roleService.deleteListRole((List<Role>) map.get("list"));
            return this.buildSuccess();
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }
    }


    /**
     * 批量添加角色菜单
     */
    @RequestMapping("/menu/insert")
    @ResponseBody
    public Map<String, Object> saveRoleMenu(@RequestBody Map<String, Object> map) {

        try {
            this.roleService.saveListRoleMenu((List<RoleMenu>) map.get("list"));
            return this.buildSuccess();
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }
    }


}
