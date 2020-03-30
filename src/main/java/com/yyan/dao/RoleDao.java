package com.yyan.dao;

import com.yyan.pojo.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface RoleDao {

    void insertRole(Role role); // 添加角色

    Integer getAllRoleByField(Map map); // 按字段查询

    List<Role> getAllRole(Map map); // 查询角色

    Integer selectCount(Map map); // 查询条数

    Role getRoleById(String id); // 通过用户id 查询角色

    void updateRole(Role role); // 更新角色

    void deleteRole(String id); // 删除角色


}
