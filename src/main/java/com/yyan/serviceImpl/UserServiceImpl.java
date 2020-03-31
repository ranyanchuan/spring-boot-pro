package com.yyan.serviceImpl;

import com.yyan.dao.UserDao;
import com.yyan.pojo.Role;
import com.yyan.pojo.User;
import com.yyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Pageable;
import java.util.*;

@Service
@Transactional // 添加事务
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User addUser(User user) {
        String id = UUID.randomUUID().toString();
        user.setId(id);
        user.setUpdateTime(new Date());
        user.setCreateTime(new Date());
        this.userDao.insertUser(user);
        return this.userDao.getUserById(id);
    }

    @Override
    public Map<String, Object> getAllUser(Map param) {
        Map<String, Object> map = new HashMap<>();
        List<User> data = this.userDao.getAllUser(param);
        Integer count = this.userDao.selectCount(param);
        map.put("data", data);
        map.put("pageIndex", param.get("pageIndex"));
        map.put("size", param.get("size"));
        map.put("count", count);
        return map;
    }

    @Override
    public Integer selectCount(Map map) {
        return this.userDao.selectCount(map);
    }

    @Override
    public User getUserById(String id) {
        return this.userDao.getUserById(id);
    }

    @Override
    public void updateUser(User user) {
        user.setUpdateTime(new Date());
        this.userDao.updateUser(user);
    }

    @Override
    public void deleteUser(String id) {
        this.userDao.deleteUser(id);
    }

    @Override
    public List<User> eHFindUserAll() {
        return null;
    }

    @Override
    public User eHFindUserById(Integer id) {
        return null;
    }

    @Override
    public Page<User> eHFindUserByPage(Pageable page) {
        return null;
    }

    @Override
    public void eHSave(User user) {

    }
}
