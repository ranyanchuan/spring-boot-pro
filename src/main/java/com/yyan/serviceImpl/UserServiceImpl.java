package com.yyan.serviceImpl;

import com.yyan.dao.UserDao;
import com.yyan.pojo.User;
import com.yyan.service.UserService;
import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Pageable;
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


    public String testUser() {
        // int a=10/0;
        return "success";
    }


    /**
     * 缓存查询所有用户
     *
     * @return
     */

    @Override
    public List<User> eHFindUserAll() {
        return userDao.getAllUser();
    }

    /**
     * 缓存查询通过 id
     *
     * @return
     */
    @Override
    @Cacheable(value = "user")  // 开启缓存 可以自定义走缓存
    public User eHFindUserById(Integer id) {
        return userDao.getUserById(id);
    }

    /**
     * 缓存分页查询通过
     *
     * @return
     */
    @Override
    @Cacheable(value = "user")  // 开启缓存 可以自定义走缓存
    public Page<User> eHFindUserByPage(Pageable page) {
        return null;
    }

    /**
     * 缓存保存
     *
     * @return
     */
    @Override
    public void eHSave(User user) {
//        userDao.save(user);
    }


}
