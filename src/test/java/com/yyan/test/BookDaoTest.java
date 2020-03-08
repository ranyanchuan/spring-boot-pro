package com.yyan.test;

import com.yyan.App;
import com.yyan.dao.BookDao;
import com.yyan.dao.BookJpaRepository;
import com.yyan.pojo.Book;
import com.yyan.serviceImpl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {App.class})

public class BookDaoTest {

    @Autowired
    private BookDao bookDao;
    @Autowired
    private BookJpaRepository bookJpaRepository;

    @Test
    public void testAddBook() {
        Book book = new Book();
        book.setNum(10);
        book.setTitle("java");
        bookDao.save(book);
    }

    @Test
    public void testFindByTitle() {

        List<Book> list = bookJpaRepository.findByTitle("java");
        System.out.println("list "+list.toString());
    }


    @Test
    public void testFindByTitleAndNum() {
        List<Book> list = bookJpaRepository.findByTitleAndNum("java",10);
        System.out.println("list and "+list.toString());
    }
    @Test
    public void testFindByTitleOrNum() {
        List<Book> list = bookJpaRepository.findByTitleOrNum("java",11);
        System.out.println("list or "+list.toString());
    }
}
