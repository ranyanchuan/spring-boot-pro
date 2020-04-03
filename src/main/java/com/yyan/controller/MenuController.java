package com.yyan.controller;

import com.yyan.pojo.Menu;
import com.yyan.serviceImpl.MenuServiceImpl;
import com.yyan.utils.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/menu")
public class MenuController extends BaseController {

    @Autowired
    private MenuServiceImpl menuService;

    /**
     * 批量添加菜单
     */
    @RequestMapping("/insert")
    @ResponseBody
    public Map<String, Object> insertMenu(@RequestBody Map<String, Object> map) {
        try {
            this.menuService.insertListMenu((List<Menu>) map.get("list"));
            return this.buildSuccess();
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }
    }

    /**
     * 批量查询菜单
     */
    @RequestMapping("/select")
    @ResponseBody
    public Map<String, Object> selectMenu(@RequestBody Map<String, Object> map) {
        try {
            return this.buildSuccess(this.menuService.selectListMenu(map));
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }
    }


    /**
     * 批量修改菜单
     */
    @RequestMapping("/update")
    @ResponseBody
    public Map<String, Object> updateMenu(@RequestBody Map<String, Object> map) {
        try {
            this.menuService.updateListMenu((List<Menu>) map.get("list"));
            return this.buildSuccess();
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }
    }

    /**
     * 批量删除菜单
     */
    @RequestMapping("/delete")
    @ResponseBody
    public Map<String, Object> delete(@RequestBody Map<String, Object> map) {
        try {
            this.menuService.deleteListMenu((List<Menu>) map.get("list"));
            return this.buildSuccess();
        } catch (Exception exp) {
            return this.buildError(exp.getMessage());
        }
    }

}
