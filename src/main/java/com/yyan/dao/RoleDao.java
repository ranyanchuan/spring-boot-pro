package com.yyan.dao;

import com.yyan.pojo.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface RoleDao {

    /**
     * 批量添加角色
     *
     * @param list
     */
    void insertListRole(List<Role> list); //

    /**
     * 查询角色
     *
     * @param map
     * @return
     */
    List<Role> selectListRole(Map<String, Object> map); // 分页查询数据

    Integer countListRole(Map<String, Object> map); // 总条数


    /**
     * 更新角色基本信息
     *
     * @param list
     */
    void updateListRole(List<Role> list);


    /**
     * 批量删除角色基本信息
     *
     * @param list
     */

    void deleteListRole(List<Role> list);


}
