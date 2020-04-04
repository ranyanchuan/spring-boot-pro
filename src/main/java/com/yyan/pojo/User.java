package com.yyan.pojo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Date;
import javax.validation.constraints.*;

import java.util.List;

@Data
public class User {

    private String id;

    @Length(min = 2, max = 10, message = "字符串不能小于2位或者大于10位") // 验证字符串的大小
    @NotEmpty(message = "用户名不能为空") // 非空校验 不去掉首尾空格
    private String name;

    @NotEmpty(message = "用户密码不能为空")
    private String password;

    private String status;
    private Date createTime;
    private Date updateTime;
    @Email  // 验证邮箱不合法 支持表达式
    private String email;
    private transient List<Role> role;

}
