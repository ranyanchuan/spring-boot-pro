//package com.yyan.test;
//
//import com.yyan.App;
//import com.yyan.dao.BookJpaRepository;
//import com.yyan.dao.StudentRepository;
//import com.yyan.pojo.Book;
//import com.yyan.pojo.Menu;
//import com.yyan.pojo.Student;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.Set;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {App.class})
//
//
//public class Many2ManyTest {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @Test
//    public void testSave() {
//
//
//        // 创建 student对象
//        Student student = new Student();
//        student.setName("javaweb");
//        // 创建 menu 对象
//
//        Menu menu = new Menu();
//        menu.setFatherId(0);
//        menu.setTitle("xxx 关联系统");
//
//        Menu menu1 = new Menu();
//        menu1.setFatherId(1);
//        menu1.setTitle("项目管理");
//
//        Menu menu2 = new Menu();
//        menu2.setFatherId(2);
//        menu2.setTitle("日志管理");
//
//        // 关联
//
//        student.getMenus().add(menu);
//        student.getMenus().add(menu1);
//        student.getMenus().add(menu2);
//
//        menu.getStudents().add(student);
//        menu1.getStudents().add(student);
//        menu2.getStudents().add(student);
//
//        // 保存
//        studentRepository.save(student);
//
//
//    }
//
//    /**
//     * 多对多查询
//     */
//
//    @Test
//    public void testFind() {
//        Student student = studentRepository.findById(1).get();
//        System.out.println("student"+student.getName());
//
//        Set<Menu> menus=student.getMenus();
//
//        for(Menu menu:menus){
//            System.out.println("menu"+menu.toString());
//        }
//
//
//
//
//    }
//
//
//}
