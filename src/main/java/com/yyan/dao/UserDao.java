package com.yyan.dao;

import com.yyan.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    void insertUser(User user); // 添加用户

    List<User> getAllUser(); // 查询用户

    User getUserById(Integer id); // 通过用户id 查询用户

    void updateUser(User user); // 更新用户

    void deleteUser(Integer id); // 删除用户

}
