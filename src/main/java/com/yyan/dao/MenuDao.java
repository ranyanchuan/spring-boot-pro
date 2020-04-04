package com.yyan.dao;

import com.yyan.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MenuDao {

    /**
     * 批量添加菜单
     * 批量添加菜单
     *
     * @param list
     */
    void insertListMenu(List<Menu> list); //

    /**
     * 查询菜单
     *
     * @param map
     * @return
     */
    List<Menu> selectListMenu(Map<String, Object> map); // 分页查询数据
    Integer countListMenu(Map<String, Object> map); // 总条数


    /**
     * 更新菜单基本信息
     *
     * @param list
     */
    void updateListMenu(List<Menu> list);


    /**
     * 批量删除菜单基本信息
     *
     * @param list
     */

    void deleteListMenu(List<Menu> list);
}
