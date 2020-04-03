//package com.yyan.test;
//
//import com.yyan.App;
//import com.yyan.dao.BookDao;
//import com.yyan.dao.BookJpaRepository;
//import com.yyan.pojo.Book;
//import com.yyan.pojo.Student;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Example;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.Optional;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {App.class})
//public class StudentTest {
//
//
//    @Autowired
//    private BookJpaRepository bookJpaRepository;
//
//
//
//
//
//    @Test
//    public void studentActionMenu() {
//
//
//
//
//    }
//
//    /**
//     * 查询，多方 查看学生信息和学生的菜单信息
//     */
//
//    @Test
//    public void testFindBook() {
//
//        Book findOne = bookJpaRepository.findById(5).get();
//        System.out.println("findOne" + findOne.toString());
//        Student student = findOne.getStudent();
//        System.out.println("student" + student.getName());
//
//
//    }
//
//
//
//
//
//}
