package com.yyan.serviceImpl;

import com.yyan.dao.RoleDao;

import com.yyan.dao.RoleMenuDao;
import com.yyan.pojo.Role;
import com.yyan.pojo.RoleMenu;
import com.yyan.service.RoleService;
import com.yyan.utils.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class RoleServiceImpl extends BaseServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;
    @Autowired
    private RoleMenuDao roleMenuDao;

    /**
     * 批量插入角色
     *
     * @param list
     */
    @Override
    @Transactional
    public void insertListRole(List<Role> list) {
        this.roleDao.insertListRole(list);
    }

    /**
     * 批量查询角色
     *
     * @param map
     * @return
     */
    @Override
    public Map<String, Object> selectListRole(Map map) {

        List<Role> list = this.roleDao.selectListRole(map); // 查询数据库
        Integer count = this.roleDao.countListRole(map);
        return this.queryListSuccess(list, count, map); //查询成功
    }

    /**
     * 批量更新角色
     *
     * @param list
     * @return
     */
    @Override
    @Transactional
    public void updateListRole(List<Role> list) {
        this.roleDao.updateListRole(list);
    }


    /**
     * 批量删除角色
     *
     * @param list
     * @return
     */
    @Override
    @Transactional
    public void deleteListRole(List<Role> list) {
        this.roleDao.deleteListRole(list);
    }


    /**
     * 为角色授权
     * @param list
     */
    @Override
    @Transactional
    public void insertListRoleMenu(List<RoleMenu> list) {
        this.roleMenuDao.insertListRoleMenu(list);
    }

}
