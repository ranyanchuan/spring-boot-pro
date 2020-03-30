package com.yyan.serviceImpl;

import com.yyan.dao.RoleDao;
import com.yyan.pojo.Role;
import com.yyan.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
//@Transactional // 添加事务
public class RoleServiceImpl implements RoleService {


    @Autowired
    private RoleDao roleDao;


    @Override
    public String addRole(Role role) {
        // todo 查看当前角色 title 是否存在
        String roleId = UUID.randomUUID().toString();
        role.setId(roleId);
        role.setUpdateTime(new Date());
        role.setCreateTime(new Date());
        this.roleDao.insertRole(role);
        return roleId;
    }

    @Override
    public List<Role> getAllRole(Map map) {
        return this.roleDao.getAllRole(map);
    }

    @Override
    public Role getRoleById(String id) {
        return this.roleDao.getRoleById(id);
    }

    @Override
    public void updateRole(Role user) {

    }

    @Override
    public void deleteRole(String id) {

    }
}
