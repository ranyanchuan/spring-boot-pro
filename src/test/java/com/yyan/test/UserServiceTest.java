package com.yyan.test;

import com.yyan.App;
import com.yyan.pojo.User;
import com.yyan.serviceImpl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @RunWith 驱动器
 * SpringJUnit4ClassRunner.class 让 junit 和 spring 环境整合
 * @SpringBootTest(classes = {App.class})  当前类为 spring 测试类， 让 SpringBootTest 加载springboot 启动类启动框架
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {App.class})

public class UserServiceTest {

    @Autowired
    private UserServiceImpl userService;

    @Test
    public void testAddUser() {
        String string = userService.testUser();
        System.out.println("string " + string);
    }


    @Test
    public void eHFindUserById() {

        System.out.println("=============");
        User user = userService.getUserById(2);
        User user1 = userService.getUserById(2);
        System.out.println("user"+user.toString());
        System.out.println("user1"+user1.toString());

    }



}
