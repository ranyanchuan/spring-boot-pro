package com.yyan.service;

import com.yyan.pojo.UserRole;

import java.util.Map;

public interface UserRoleService {

    Map<String, Object> addUserRole(UserRole userRole);

    Map<String, Object> getUserRoleById(String id);  // 按 id 获取

    Map<String, Object> getAllUserRole(Map<String, Object> param);  // 按 id 获取

}
