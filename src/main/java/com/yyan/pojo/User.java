package com.yyan.pojo;

import org.hibernate.validator.constraints.Length;

import java.util.Date;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    //    @NotEmpty(message = "用户 id 不能为空") // 非空校验 不去掉首尾空格
    private String id;

    //     @NotBlank(message = "用户名不能为空") // 非空校验 去掉首尾空格
    @Length(min = 2, max = 10, message = "字符串不能小于2位或者大于10位") // 验证字符串的大小
    @NotEmpty(message = "用户名不能为空") // 非空校验 不去掉首尾空格
    private String name;


    @NotEmpty(message = "用户密码不能为空")
    private String password;

    // @NotEmpty(message = "用户状态")
    private String status;

    private Date createTime;
    private Date updateTime;

    @Email  // 验证邮箱不合法 支持表达式
    private String email;


    private transient List<Role> role;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}
