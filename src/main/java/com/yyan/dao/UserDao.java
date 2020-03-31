package com.yyan.dao;

import com.yyan.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {

    void insertUser(User user); // 添加用户

    List<User> getAllUser(Map map); // 查询用户

    Integer selectCount(Map map); // 查询条数

    Integer getAllUserByField(Map map); // 按字段查询

    User getUserById(String id); // 通过用户id 查询用户

    void updateUser(User user); // 更新用户

    void deleteUser(String id); // 删除用户


}
