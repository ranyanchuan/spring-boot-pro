package com.yyan.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yyan.dao.UserDao;


import com.yyan.pojo.User;
import com.yyan.service.UserService;
import com.yyan.utils.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public void insertListUserRole(List<User> list) {

        String text = JSON.toJSONString(list); //序列化
        List<User> newList = JSON.parseArray(text, User.class);

        for(User user:newList){
            String id = UUID.randomUUID().toString(); // 主表 id
            user.setId(id);
            userDao.insertUser(user);
            // todo 修改子表


        }
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



