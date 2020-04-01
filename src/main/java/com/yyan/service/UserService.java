package com.yyan.service;

import com.yyan.pojo.User;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Map;

public interface UserService {

    User addUser(User user);

    Map<String, Object> getAllUser(Map map); // 按条件角色

    Integer selectCount(Map map); // 查询条数

    User getUserById(String id); // 通过 id 查询用户

    void updateUser(User user);  // 更新用户

    void deleteUser(String id); // 删除用户

    Map<String, Object> queryRole(String id); // 通过用户id 查询角色

    Map<String, Object> getQueryUserRoleList(Map<String, Object> map); // 通过user查询user_role

    // ==== ehcache 缓存测试 ===

    List<User> eHFindUserAll(); // 查询所有

    User eHFindUserById(Integer id); // 通过 id

    Page<User> eHFindUserByPage(Pageable page); // 分页查询

    void eHSave(User user); // 保存


}
