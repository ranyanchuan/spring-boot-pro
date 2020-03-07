package com.yyan.controller;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * springboot 异常处理
 */
@Controller
@RequestMapping("/exception")

public class ExceptionController {


    @RequestMapping("/one")
    @ExceptionHandler // 异常处理 不推荐
    @ResponseBody
    public String exceptionHandler(Exception e) {

        return e.toString();
    }

    // 验证全局 @ControllerAdvice  异常
    @RequestMapping("/two")
    @ResponseBody
    public String exceptionAdvice() {
        int a = 10 / 0;
        return "okqq";
    }

    // todo 没有验证成功
    // 验证全局 @ControllerAdvice  异常
    @RequestMapping("/three")
    @ResponseBody
    public String exceptionConfig() {
        int data[] = new int[1]; /*开辟了一个长度为3的数组*/
        System.out.println(data[4]);
        return "ok";
    }
}
