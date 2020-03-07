package com.yyan.pojo;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

public class User {


    // @NotBlank(message = "用户名不能为空") // 非空校验 去掉首尾空格
    @Length(min = 2, max = 10, message = "字符串不能小于2位或者大于10位") // 验证字符串的大小
    @NotEmpty(message = "用户名不能为空") // 非空校验 不去掉首尾空格
    private String name;
    private Integer id;

    @Min(value = 1, message = "年龄不能小于1") // 校验数字不能小于
    @Max(value = 100, message = "年龄不能大于100") // 校验数字不能大于
    private Integer age;

    @Email  // 验证邮箱不合法 支持表达式
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(String name, Integer id, Integer age,String email) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.email = email;
    }

    public User() {
    }
}
