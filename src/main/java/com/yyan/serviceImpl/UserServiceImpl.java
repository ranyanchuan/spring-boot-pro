package com.yyan.serviceImpl;

import com.yyan.dao.UserDao;
import com.yyan.pojo.User;
import com.yyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    /**
     * @return
     */
    @Override
    public List<User> getAll() {
        return userDao.getAllUser();
    }

    /**
     * @return
     */
    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    /**
     * @return
     */
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    /**
     * @return
     */
    @Override
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);
    }


}
