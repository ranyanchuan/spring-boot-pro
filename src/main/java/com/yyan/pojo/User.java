package com.yyan.pojo;

public class User {

    private String userName;
    private Integer userId;
    private Integer userAge;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public User(String userName, Integer userId, Integer userAge) {
        this.userName = userName;
        this.userId = userId;
        this.userAge = userAge;
    }

    public User() {
    }
}
