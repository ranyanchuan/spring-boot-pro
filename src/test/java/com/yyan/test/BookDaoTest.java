package com.yyan.test;

import com.yyan.App;
import com.yyan.dao.BookDao;
import com.yyan.pojo.Book;
import com.yyan.serviceImpl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {App.class})

public class BookDaoTest {

    @Autowired
    private BookDao bookDao;

    @Test
    public void testAddBook() {
        Book book = new Book();
        book.setNum(10);
        book.setTitle("java");
        bookDao.save(book);
    }
}
