package com.yyan.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.UUID;


@Aspect
@Component
public class ServiceImplAspect {

    // 添加操作
    @Pointcut("execution(* com.yyan.serviceImpl.*.add*(..))")
    public void addAction() {
    }

    // 更新操作
    @Pointcut("execution(* com.yyan.serviceImpl.*.update*(..))")
    public void updateAction() {
    }


    @Before("updateAction()")
    public Object updateBefore(JoinPoint joinPoint) throws Throwable {
        // 获取请求参数
        Object[] args = joinPoint.getArgs();
        // 通过反射获取 updateTime 属性
        Field field = args[0].getClass().getDeclaredField("updateTime");
        field.setAccessible(true);
        field.set(args[0], new Date());
        return args[0];
    }


    @Before("addAction()")
    public Object addBefore(JoinPoint joinPoint) throws Throwable {
        // 获取请求参数
        Object[] args = joinPoint.getArgs();
        // 通过反射获取 updateTime 属性

        Class<?> clazz = args[0].getClass();

        // 添加id
        String id = UUID.randomUUID().toString();
        Field idField = clazz.getDeclaredField("id");
        idField.setAccessible(true);
        idField.set(args[0], id);

        // 修改时间
        Field updateTimeField = clazz.getDeclaredField("updateTime");
        updateTimeField.setAccessible(true);
        updateTimeField.set(args[0], new Date());

        // 创建时间
        Field createTimeField = clazz.getDeclaredField("createTime");
        createTimeField.setAccessible(true);
        createTimeField.set(args[0], new Date());

        return args[0];
    }






}
