package com.yyan.pojo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "menu")
public class Menu {


    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 主键生成策略
    @Column(name="id") // 表的列名叫 id
    private Integer id;

    @Column(name="title") // 表的列名叫 id
    private String title;

    @Column(name="url") // 表的列名叫 id
    private String url;

    @Column(name="fatherId") // 表的列名叫 id
    private Integer fatherId;


    @ManyToMany(mappedBy = "menus")
    private Set<Student> students=new HashSet<>();

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", fatherId=" + fatherId +
                '}';
    }
}
