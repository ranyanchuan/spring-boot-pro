package com.yyan.dao;

import com.yyan.pojo.Role;
import com.yyan.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleDao {
    void insertRole(Role role); // 添加角色

    List<User> getAllRole(); // 查询角色

    User getRoleById(String id); // 通过用户id 查询角色

    void updateRole(Role role); // 更新角色

    void deleteRole(String id); // 删除角色

}
