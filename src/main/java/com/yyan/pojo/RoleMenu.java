package com.yyan.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class RoleMenu {

    private String id;
    private String roleId;
    private String menuId;
    private Date createTime;
    private Date updateTime;


}
