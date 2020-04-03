package com.yyan.serviceImpl;

import com.yyan.dao.UserDao;
import com.yyan.pojo.Role;
import com.yyan.pojo.User;
import com.yyan.service.UserService;
import com.yyan.utils.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Pageable;
import java.util.*;

@Service
@Transactional // 添加事务
public class UserServiceImpl extends BaseServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 批量添加用户
     *
     * @param list
     */
    @Override
    public void insertListUser(List<User> list) {
        this.userDao.insertListUser(list);
    }

    /**
     * 查询用户基本信息
     *
     * @param map
     * @return
     */
    @Override
    public Map<String, Object> selectListUser(Map map) {

        List<?> newList = this.queryListClearField(
                userDao.selectListUser(map), // 查询数据库
                new String[]{"password", "status", "role"} // 清空前端不需要的字段
        );
        Integer count = this.userDao.countListUser(map);
        return this.queryListSuccess(newList, count, map); //查询成功
    }


    /**
     * 批量修改用户基本信息
     *
     * @param list
     */

    @Override
    @Transactional(rollbackFor = Exception.class) // 事务回滚
    public void updateListUser(List<User> list) {
        this.userDao.updateListUser(list);
    }

    /**
     * 批量删除用户基本信息
     *
     * @param list
     */
    @Override
    @Transactional(rollbackFor = Exception.class) // 事务回滚
    public void deleteListUser(List<User> list) {
        this.userDao.deleteListUser(list);
    }


    @Override
    public User addUser(User user) {
        this.userDao.insertUser(user);
        return this.userDao.getUserById(user.getId());
    }

    @Override
    public Map<String, Object> getAllUser(Map param) {
        List<User> data = this.userDao.getAllUser(param);
        Integer count = this.userDao.selectCount(param);
        return this.queryListSuccess(data, count, param); //查询成功
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
        this.userDao.updateUser(user);
    }

    @Override
    public void deleteUser(String id) {
        this.userDao.deleteUser(id);
    }

    @Override
    public Map<String, Object> queryRole(String id) {
        return null;
    }

    @Override
    public Map<String, Object> getQueryUserRoleList(Map<String, Object> param) {

        List<?> newList = this.queryListClearField(
                userDao.queryUserRoleList(param), // 查询数据库
                new String[]{"password"} // 清空前端不需要的字段
        );

        return this.queryListSuccess(newList, 5, param); //查询成功
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



