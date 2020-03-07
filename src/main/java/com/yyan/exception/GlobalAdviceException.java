package com.yyan.exception;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局异常处理 @ControllerAdvice+@ExceptionHandler
 */

@ControllerAdvice
public class GlobalAdviceException {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map errorHandler(Exception ex) {
        Map map = new HashMap();
        map.put("code", 400);
        //判断异常的类型,返回不一样的返回值
        if (ex instanceof MissingServletRequestParameterException) {
            map.put("msg", "缺少必需参数：" + ((MissingServletRequestParameterException) ex).getParameterName());
        } else {
            map.put("msg", "这是自定义异常");
        }
        return map;
    }


}
