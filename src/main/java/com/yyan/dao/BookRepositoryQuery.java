//package com.yyan.dao;
//
//
//import com.yyan.pojo.Book;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.Repository;
//
//import java.util.List;
//
///**
// * repository @query 查询
// */
//public interface BookRepositoryQuery extends Repository<Book, Integer> {
//
//    // 没有验证成功
//    // @Query("from book where title= ? 1")
//    // nativeQuery 这是一条标准的 sql 语句
//    @Query(value = "select title,id,num from book where title= ?", nativeQuery = true)
//    List<Book> queryByTitleUseHQL(String title);
//
//
//    @Query(value = "update book set title =?1 where id =?2",nativeQuery = true)
//    @Modifying // 需要执行更新操作
//    void updateByTitleUseHQL(String title, Integer id); // 更新 book
//
//
//}
