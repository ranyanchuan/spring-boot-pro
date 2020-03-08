package com.yyan.pojo;

import javax.persistence.*;

@Entity  // 当前类式一个实体
@Table(name = "book") // 实体对应的数据库表相对应
public class Book {

    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 主键生成策略
    @Column(name="id") // 表的列名叫 id
    private Integer id;

    @Column(name="title") // 表的列名叫 title
    private String title;

    @Column(name="num") // 表的列名叫 title
    private Integer num;


    @ManyToOne(cascade = CascadeType.PERSIST) // 一朵关系  book 是多方
    @JoinColumn(name="studentId") // 外键
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", num=" + num +
                ", student=" + student +
                '}';
    }
}
