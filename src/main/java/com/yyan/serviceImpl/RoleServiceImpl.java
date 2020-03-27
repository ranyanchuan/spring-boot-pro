package com.yyan.serviceImpl;

import com.yyan.dao.RoleDao;
import com.yyan.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional // 添加事务
public class RoleServiceImpl {


    @Autowired
    private RoleDao roleDao;

    /**
     * 添加角色
     *
     * @param role
     */
    public void addRole(Role role) {

        // todo 查看当前角色 title 是否存在
        String roleId = UUID.randomUUID().toString();
        role.setId(roleId);
        role.setUpdateTime(new Date());
        role.setCreateTime(new Date());
        this.roleDao.insertRole(role);


    }


}
