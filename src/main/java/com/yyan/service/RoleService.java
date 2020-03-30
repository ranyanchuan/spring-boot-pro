package com.yyan.service;

import com.yyan.pojo.Role;

import java.util.List;
import java.util.Map;

public interface RoleService {

    Role addRole(Role role) throws Exception; // 添加角色

    Map<String, Object> getAllRole(Map map); // 按条件角色

    Integer selectCount(Map map); // 查询条数

    Role getRoleById(String id);  // 按 id 获取角色

    void updateRole(Role user); // 通过 id 更新用户

    void deleteRole(String id); // 通过 id 删除用户

//    // ==== ehcache 缓存测试 ===
//
//    List<User> eHFindUserAll(); // 查询所有
//
//    User eHFindUserById(Integer id); // 通过 id
//
//    Page<User> eHFindUserByPage(Pageable page); // 分页查询
//
//    void eHSave(User user); // 保存
}
