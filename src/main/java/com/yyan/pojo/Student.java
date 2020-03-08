package com.yyan.pojo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * 关系 一个学生有很多书
 */

@Entity
@Table(name = "student") // 实体对应的数据库表相对应

public class Student {

    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 主键生成策略
    @Column(name="id") // 表的列名叫 id
    private Integer id;

    @Column(name="name") // 表的列名叫 name
    private String name;

//    @Column(name="name") // 表的列名叫 name
    @OneToMany(mappedBy = "student")
    private Set<Book> book=new HashSet<>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBook() {
        return book;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }
}
