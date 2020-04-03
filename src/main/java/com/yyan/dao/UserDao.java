package com.yyan.dao;

import com.yyan.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {

    /**
     * //===用户表=====
     * user/insert/       --> 按多条实现 添加用户
     * user/select/       --> 按多条实现 查询用户
     * user/update/       --> 按多条实现 更新用户
     * user/delete/       --> 按多条实现 删除用户
     * user/login/        --> 用户登录
     * user/pass/update/  --> 用户修改密码
     * //===用户授权角色====
     * user/role/select/     --> 按多条实现 查看用户角色
     * user/role/update/     --> 按多条实现 修改用户角色
     */



    /**
     * 批量添加用户
     *
     * @param list
     */
    void insertListUser(List<User> list); //

    /**
     * 查询用户
     *
     * @param map
     * @return
     */
    List<User> selectListUser(Map<String, Object> map); // 分页查询数据

    Integer countListUser(Map<String, Object> map); // 总条数


    /**
     * 更新用户基本信息
     *
     * @param list
     */
    void updateListUser(List<User> list);










    void insertUser(User user); // 添加用户

    List<User> getAllUser(Map map); // 查询用户

    Integer selectCount(Map map); // 查询条数

    Integer getAllUserByField(Map map); // 按字段查询

    User queryUserRole(String id); // 通过用户id 查询用户角色

    List<User> queryUserRoleList(Map map); // 查询用户表中的角色

    User getUserById(String id); // 通过用户id 查询用户

    void updateUser(User user); // 更新用户

    void deleteUser(String id); // 删除用户

}
