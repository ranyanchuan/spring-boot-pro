package com.yyan.dao;


import com.yyan.pojo.Book;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * 1、Repository  接口
 * 提供了方法名称命名查询方式
 * 提供了基于 @query 注解查询与更新
 */

public interface BookJpaRepository extends Repository<Book, Integer> {

    /**
     * 通过方法名称查询 严格要求 方法名称遵守驼峰命名    findBy+属性名称(首字母大小)+ 查询条件(首字母大小)
     *
     * @param title Is、Equals       等价于 SQL 中的 = 关键字  findByTitleIs(String title)
     *              And --- 等价于 SQL 中的 and 关键字，比如 findByUsernameAndPassword(String user, Striang pwd)；
     *              Or --- 等价于 SQL 中的 or 关键字，比如 findByUsernameOrAddress(String user, String addr)；
     *              Between --- 等价于 SQL 中的 between 关键字，比如 findBySalaryBetween(int max, int min)；
     *              LessThan --- 等价于 SQL 中的 "<"，比如 findBySalaryLessThan(int max)；
     *              GreaterThan --- 等价于 SQL 中的">"，比如 findBySalaryGreaterThan(int min)；
     *              IsNull --- 等价于 SQL 中的 "is null"，比如 findByUsernameIsNull()；
     *              IsNotNull --- 等价于 SQL 中的 "is not null"，比如 findByUsernameIsNotNull()；
     *              NotNull --- 与 IsNotNull 等价；
     *              Like --- 等价于 SQL 中的 "like"，比如 findByUsernameLike(String user)；
     *              NotLike --- 等价于 SQL 中的 "not like"，比如 findByUsernameNotLike(String user)；
     *              OrderBy --- 等价于 SQL 中的 "order by"，比如 findByUsernameOrderBySalaryAsc(String user)；
     *              Not --- 等价于 SQL 中的 "！ ="，比如 findByUsernameNot(String user)；
     *              In --- 等价于 SQL 中的 "in"，比如 findByUsernameIn(Collection<String> userList) ，方法的参数可以是 Collection 类型，也可以是数组或者不定长参数；
     *              NotIn --- 等价于 SQL 中的 "not in"，比如 findByUsernameNotIn(Collection<String> userList) ，方法的参数可以是 Collection 类型，也可以是数组或者不定长参数；
     * @return
     */

    List<Book> findByTitle(String title);

    List<Book> findByTitleAndNum(String title, Integer num);
    List<Book> findByTitleOrNum(String title, Integer num);

}
