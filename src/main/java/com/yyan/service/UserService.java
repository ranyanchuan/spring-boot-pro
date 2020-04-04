package com.yyan.service;

import com.yyan.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    void insertListUserRole(List<User> list); //批量添加用户

    Map<String, Object> selectListUserRole(Map map); // 查询用户信息

    void updateListUserRole(List<User> list); // 批量修改用户信息

    void deleteListUserRole(List<User> list); // 批量删除用户信息


}
