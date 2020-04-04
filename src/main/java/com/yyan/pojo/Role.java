package com.yyan.pojo;

import lombok.Data;


import java.util.Date;
import java.util.List;

@Data
public class Role {
    private String id;
    private String title;
    private Date createTime;
    private Date updateTime;
    private String dr;
    private List<RoleMenu> RoleMenu;

}
