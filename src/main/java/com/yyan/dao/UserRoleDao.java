package com.yyan.dao;

import com.yyan.pojo.Role;
import com.yyan.pojo.UserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserRoleDao {

    void insertUserRole(UserRole userRole); // 为用户添加角色

    UserRole getUserRoleById(String id); // 通过id 获取用户角色

    List<Map<String, Object>> getAllUserRole(Map map); // 查询角色




}
