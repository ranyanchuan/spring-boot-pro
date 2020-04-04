package com.yyan.dao;

import com.yyan.pojo.RoleMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMenuDao {

    /**
     * 批量为角色授权
     *
     * @param list
     */
    void insertListRoleMenu(List<RoleMenu> list); //


}
