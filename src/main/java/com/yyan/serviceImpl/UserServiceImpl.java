package com.yyan.serviceImpl;

import com.yyan.dao.UserDao;
import com.yyan.pojo.User;
import com.yyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional // 添加事务
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 添加用户
     *
     * @param user
     */
    @Override
    public void addUser(User user) {
        this.userDao.insertUser(user);
    }
}
