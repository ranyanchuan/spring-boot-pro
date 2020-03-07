package com.yyan.dao;

import com.yyan.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * T: 当前需要映射的实体
 * TD: 当前映射的实体中 OID 的类型
 */

public interface BookDao extends JpaRepository<Book, Integer> {

}
