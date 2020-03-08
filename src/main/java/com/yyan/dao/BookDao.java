package com.yyan.dao;

import com.yyan.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * T: 当前需要映射的实体
 * TD: 当前映射的实体中 OID 的类型
 * ========核心接口=====
 * 1、Repository  接口
 *    提供了方法名称命名查询方式
 *    提供了基于 @query 注解查询与更新
 *
 * 2、CrudRepository  接口
 *    继承 Repository
 *
 * 3、PageAndSortingRepository  接口
 *   继承了 CrudRepository
 *   主要提供了分页和排序操作
 *
 * 4、JpaRepository  接口
 *    继承 PageAndSortingRepository
 *
 * 5、JpaSpecificationExecutor  接口
 *   改接口主要提供了多条件查询的支持，编辑可以在查询中添加分页和排序
 *
 *
 */


public interface BookDao extends JpaRepository<Book, Integer> {

}


