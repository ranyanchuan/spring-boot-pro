package com.yyan.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Role {
    private String id;
    private String title;
    private Date createTime;
    private Date updateTime;
    private String dr;

}
