package com.yyan.service;

import com.yyan.pojo.Role;

import java.util.List;
import java.util.Map;

public interface RoleService {

    void insertListRole(List<Role> list); //批量添加角色

    Map<String, Object> selectListRole(Map map); // 查询角色信息

    void updateListRole(List<Role> list); // 批量修改角色信息

    void deleteListRole(List<Role> list); // 批量删除角色信息


}
