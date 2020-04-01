package com.yyan.serviceImpl;

import com.yyan.dao.RoleDao;
import com.yyan.pojo.Role;
import com.yyan.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
//@Transactional // 添加事务
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;


    @Override
    public Role addRole(Role role) throws Exception{

        // 查看当前角色 title 是否存在
        Map<String,Object> queryMap=new HashMap<>();
        queryMap.put("title",role.getTitle());
        Integer count =this.roleDao.getAllRoleByField(queryMap);
        if(count>0){
            // 抛异常
            throw new Exception("角色名称已经存在");
        }
        this.roleDao.insertRole(role);
        return this.roleDao.getRoleById(role.getId());
    }

    @Override
    public Map<String, Object> getAllRole(Map param) {
        Map<String, Object> map = new HashMap<>();
        List<Role> data = this.roleDao.getAllRole(param);
        Integer count = this.roleDao.selectCount(param);
        map.put("data", data);
        map.put("pageIndex", param.get("pageIndex"));
        map.put("size", param.get("size"));
        map.put("count", count);
        return map;
    }

    @Override
    public Integer selectCount(Map map) {
        return this.roleDao.selectCount(map);
    }

    @Override
    public Role getRoleById(String id) {
        return this.roleDao.getRoleById(id);
    }

    @Override
    public void updateRole(Role role) {
        this.roleDao.updateRole(role);
    }

    @Override
    public void deleteRole(String id) {
        this.roleDao.deleteRole(id);
    }

}
