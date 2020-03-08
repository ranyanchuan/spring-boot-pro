package com.yyan.dao;

import com.yyan.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * JpaSpecificationExecutor 该接口主要提供了多条件查询的支持，编辑可以在查询中添加分页和排序，通常与 JpaRepository 配合使用
 *
 */


public interface BookSpecificationExecutor extends JpaRepository<Book,Integer>, JpaSpecificationExecutor<Book> {
}
