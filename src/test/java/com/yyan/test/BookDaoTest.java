package com.yyan.test;

import com.yyan.App;
import com.yyan.dao.BookDao;
import com.yyan.dao.BookJpaCrudRepository;
import com.yyan.dao.BookJpaRepository;
import com.yyan.dao.BookJpaRepositoryQuery;
import com.yyan.pojo.Book;
import com.yyan.serviceImpl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {App.class})

public class BookDaoTest {

    @Autowired
    private BookDao bookDao;
    @Autowired
    private BookJpaRepository bookJpaRepository;
    @Autowired
    private BookJpaRepositoryQuery bookJpaRepositoryQuery;

    @Autowired
    private BookJpaCrudRepository bookJpaCrudRepository;


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
        System.out.println("list " + list.toString());
    }


    @Test
    public void testFindByTitleAndNum() {
        List<Book> list = bookJpaRepository.findByTitleAndNum("java", 10);
        System.out.println("list and " + list.toString());
    }

    @Test
    public void testFindByTitleOrNum() {
        List<Book> list = bookJpaRepository.findByTitleOrNum("java", 11);
        System.out.println("list or " + list.toString());
    }

    @Test
    public void testQueryByTitleUseHQL() {
        List<Book> list = bookJpaRepositoryQuery.queryByTitleUseHQL("java");
        System.out.println("list query " + list.toString());
    }


    /**
     * 老版本 @Test 与  @Transactional 在一起会自动回滚
     * @Rollback(false)  取消回滚
     */

    @Test
    @Transactional // 加上事务
    public void testUpdateByTitleUseHQL() {
        bookJpaRepositoryQuery.updateByTitleUseHQL("javas", 1);
    }


    @Test
    public void testCurdSave() {

        Book book=new Book();
        book.setTitle("android");
        book.setNum(20);

        bookJpaCrudRepository.save(book);
        System.out.println("save testCurdByTitleUseHQL");
    }

}
