package com.yyan.pojo;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;
import javax.xml.crypto.Data;
import java.io.Serializable;

public class User implements Serializable {

    @NotEmpty(message = "用户 id 不能为空") // 非空校验 不去掉首尾空格
    private String id;

    // @NotBlank(message = "用户名不能为空") // 非空校验 去掉首尾空格
    @Length(min = 2, max = 10, message = "字符串不能小于2位或者大于10位") // 验证字符串的大小
    @NotEmpty(message = "用户名不能为空") // 非空校验 不去掉首尾空格
    private String name;


    @NotEmpty(message = "用户密码不能为空")
    private String password;


    @NotEmpty(message = "用户状态")
    private String status;


    private Data createTime;
    private Data updateTime;

    @Email  // 验证邮箱不合法 支持表达式
    private String email;



}
