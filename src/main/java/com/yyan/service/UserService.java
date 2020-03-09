package com.yyan.service;

import com.yyan.pojo.User;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> getAll();

    User getUserById(Integer id);

    void updateUser(User user);

    void deleteUser(Integer id); // 删除用户

    // ==== ehcache 缓存测试 ===

    List<User> eHFindUserAll(); // 查询所有

    User eHFindUserById(Integer id); // 通过 id

    Page<User> eHFindUserByPage(Pageable page); // 分页查询

    void eHSave(User user); // 保存


}
