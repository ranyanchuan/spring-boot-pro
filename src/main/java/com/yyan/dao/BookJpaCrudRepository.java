package com.yyan.dao;


import com.yyan.pojo.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * curdRepostory 继承了 repository
 */

public interface BookJpaCrudRepository extends CrudRepository<Book,Integer> {

}
