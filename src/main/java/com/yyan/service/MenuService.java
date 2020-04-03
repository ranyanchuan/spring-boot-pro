package com.yyan.service;

import com.yyan.pojo.Menu;

import java.util.List;
import java.util.Map;

public interface MenuService {

    void insertListMenu(List<Menu> list); //批量添加菜单

    Map<String, Object> selectListMenu(Map map); // 查询菜单信息

    void updateListMenu(List<Menu> list); // 批量修改菜单信息

    void deleteListMenu(List<Menu> list); // 批量删除菜单信息
}
