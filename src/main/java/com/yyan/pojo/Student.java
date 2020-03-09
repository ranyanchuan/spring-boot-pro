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

    //  @JoinTable: 映射中间表 joinColumns 当前表中的主键关联的中间表中的外键字段
    @ManyToMany(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)  // 多对关系  student 是多方
    @JoinTable(name = "student_menu",joinColumns =@JoinColumn(name="student_id"),inverseJoinColumns = @JoinColumn(name="menu_id"))
    private Set<Menu> menus=new HashSet<>();

    public Set<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", book=" + book +
                ", menus=" + menus.toString() +
                '}';
    }

    public Set<Book> getBook() {
        return book;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }
}
