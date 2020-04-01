package com.yyan.serviceImpl;

import com.yyan.dao.UserRoleDao;
import com.yyan.pojo.Role;
import com.yyan.pojo.UserRole;
import com.yyan.service.UserRoleService;
import com.yyan.utils.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
@Transactional // 添加事务
public class UserRoleServiceImpl extends BaseServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleDao userRoleDao;


    @Override
    public Map<String,Object> addUserRole(UserRole userRole) {
        userRoleDao.insertUserRole(userRole); //添加用户角色
        return null;
    }

    @Override
    public Map<String,Object> getUserRoleById(String id) {
        userRoleDao.getUserRoleById(id);
        return null;
    }

    @Override
    public Map<String, Object> getAllUserRole(Map<String, Object> param) {




        return null;
    }

}
