package com.yyan.serviceImpl;

import com.yyan.dao.UserDao;
import com.alibaba.fastjson.JSON;

import com.yyan.pojo.Role;
import com.yyan.pojo.User;
import com.yyan.service.UserService;
import com.yyan.utils.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    public void insertListUserRole(List<User> list) {
        this.userDao.insertListUserRole(list);
    }

    /**
     * 查询用户基本信息
     *
     * @param map
     * @return
     */
    @Override
    public Map<String, Object> selectListUserRole(Map map) {

        List<?> newList = this.queryListClearField(
                userDao.selectListUserRole(map), // 查询数据库
                new String[]{"password", "status"} // 清空前端不需要的字段
        );
        Integer count = this.userDao.countListUserRole(map);
        return this.queryListSuccess(newList, count, map); //查询成功
    }


    /**
     * 批量修改用户基本信息
     *
     * @param list
     */

    @Override
    @Transactional(rollbackFor = Exception.class) // 事务回滚
    public void updateListUserRole(List<User> list) {
        this.userDao.updateListUserRole(list);
    }

    /**
     * 批量删除用户基本信息
     *
     * @param list
     */
    @Override
    @Transactional(rollbackFor = Exception.class) // 事务回滚
    public void deleteListUserRole(List<User> list) {
        this.userDao.deleteListUserRole(list);
    }


}



