package com.yyan.pojo;

import lombok.Data;
import java.util.Date;

@Data
public class Menu {

    private String id;

    private String pid;
    private String title;
    private String url;
    private Date createTime;
    private Date updateTime;


}
