package com.yyan.dao;

import com.yyan.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository  接口
 * 继承 PageAndSortingRepository
 */

public interface BookJpaRepository extends JpaRepository<Book, Integer> {

}
