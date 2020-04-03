//package com.yyan.test;
//
//import com.yyan.App;
//import com.yyan.dao.*;
//import com.yyan.pojo.Book;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.jpa.domain.Specification;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Predicate;
//import javax.persistence.criteria.Root;
//import java.util.ArrayList;
//import java.util.List;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {App.class})
//
//public class BookDaoTest {
//
//    @Autowired
//    private BookDao bookDao;
//    @Autowired
//    private BookRepositoryByXxx bookRepository;
//    @Autowired
//    private BookRepositoryQuery bookRepositoryQuery;
//
//    @Autowired
//    private BookCrudRepository bookCrudRepository;
//
//    @Autowired
//    private BookPageAndSortingRepository bookPageAndSortingRepository;
//
//    @Autowired
//    private BookJpaRepository bookJpaRepository;
//    @Autowired
//    private BookSpecificationExecutor bookSpecificationExecutor;
//
//
//    @Test
//    public void testAddBook() {
//        Book book = new Book();
//        book.setNum(10);
//        book.setTitle("java");
//        bookDao.save(book);
//    }
//
//    /**
//     * Repository 默认 查询测试
//     */
//
//    @Test
//    public void testFindByTitle() {
//
//        List<Book> list = bookRepository.findByTitle("java");
//        System.out.println("list " + list.toString());
//    }
//
//    /**
//     * Repository and查询测试
//     */
//    @Test
//    public void testFindByTitleAndNum() {
//        List<Book> list = bookRepository.findByTitleAndNum("java", 10);
//        System.out.println("list and " + list.toString());
//    }
//
//
//    @Test
//    public void testFindByTitleOrNum() {
//        List<Book> list = bookRepository.findByTitleOrNum("java", 11);
//        System.out.println("list or " + list.toString());
//    }
//
//
//    /**
//     * @Query 查询测试
//     */
//
//    @Test
//    public void testQueryByTitleUseHQL() {
//        List<Book> list = bookRepositoryQuery.queryByTitleUseHQL("java");
//        System.out.println("list query " + list.toString());
//    }
//
//
//    /**
//     * @Query 修改测试
//     * <p>
//     * <p>
//     * 老版本 @Test 与  @Transactional 在一起会自动回滚
//     * @Rollback(false) 取消回滚
//     */
//
//    @Test
//    @Transactional // 加上事务
//    public void testUpdateByTitleUseHQL() {
//        bookRepositoryQuery.updateByTitleUseHQL("javas", 1);
//    }
//
//
//    /**
//     * CrudRepository 保存测试
//     */
//    @Test
//    public void testCurdSave() {
//
//        Book book = new Book();
//        book.setTitle("android");
//        book.setNum(20);
//        book.setId(1);
//
//        bookCrudRepository.save(book);
//        System.out.println("save testCurdByTitleUseHQL");
//    }
//
//
//    /**
//     * CrudRepository 删除测试
//     */
//
//    @Test
//    public void testCurdDelete() {
//
//        bookCrudRepository.deleteById(4);
//        System.out.println("deleteById");
//    }
//
//
//    /**
//     * BookPageAndSortingRepository 排序测试
//     */
//
//    @Test
//    public void testBookSortingRepository() {
//        // order 对象定义排序规则
//        Sort.Order order = new Sort.Order(Sort.Direction.DESC, "id");
//        // Sort 对象封装排序
//        Sort sort = new Sort(order);
//        List<Book> list = (List<Book>) bookPageAndSortingRepository.findAll(sort);
//        System.out.println("list " + list.toString());
//    }
//
//
//    /**
//     * BookPageAndSortingRepository 分页测试
//     */
//
//    @Test
//    public void testBookPageRepository() {
//        // Pageable  封装分页参数，当前页、每一页的条数，当前页是从0开始
//
//
//        Pageable pageTable = new PageRequest(0, 2);
//
//        Page<Book> page = bookPageAndSortingRepository.findAll(pageTable);
//
//        System.out.println("totalItem " + page.getTotalElements());
//        System.out.println("totalPage " + page.getTotalPages());
//        System.out.println("list " + page.getContent().toString());
//
//    }
//
//
//    /**
//     * 排序+分页
//     */
//    @Test
//    public void testBookSortAndPageRepository() {
//        // Pageable  封装分页参数，当前页、每一页的条数，当前页是从0开始
//
//        // order 对象定义排序规则
//        Sort.Order order = new Sort.Order(Sort.Direction.DESC, "id");
//        // Sort 对象封装排序
//        Sort sort = new Sort(order);
//
//        // 添加分页信息和排序对象
//        Pageable pageTable = new PageRequest(0, 2, sort);
//
//        Page<Book> page = bookPageAndSortingRepository.findAll(pageTable);
//
//        System.out.println("totalItem " + page.getTotalElements());
//        System.out.println("totalPage " + page.getTotalPages());
//        System.out.println("list " + page.getContent().toString());
//
//    }
//
//    /**
//     * JpaRepository 排序
//     */
//    @Test
//    public void testBookJpaRepository() {
//        // Pageable  封装分页参数，当前页、每一页的条数，当前页是从0开始
//
//        // order 对象定义排序规则
//        Sort.Order order = new Sort.Order(Sort.Direction.DESC, "id");
//        // Sort 对象封装排序
//        Sort sort = new Sort(order);
//
//        // 添加分页信息和排序对象
//        Pageable pageTable = new PageRequest(0, 2, sort);
//
//        Page<Book> page = bookJpaRepository.findAll(pageTable);
//
//        System.out.println("totalItem " + page.getTotalElements());
//        System.out.println("totalPage " + page.getTotalPages());
//        System.out.println("list " + page.getContent().toString());
//
//    }
//
//
//    @Test
//    public void testBookSpecificationExecutor1() {
//
//
//        /**
//         *  SpecificationExecutor<Book>  用于封装查询条件
//         */
//
//        Specification<Book> spec = new Specification<Book>() {
//
//            /**
//             *
//             * @param root  查询对象属性封装
//             * @param criteriaQuery 封装了我们要执行的查询条件各部分信息  select form order
//             * @param criteriaBuilder 查询条件的构造器 定义不同的查询条件
//             * @return
//             */
//
//            @Override
//            public Predicate toPredicate(Root<Book> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
//                //  where name=“张三”;
//                /**
//                 * param1: 查询的条件属性
//                 * param2: 条件值
//                 */
//                Predicate pre = criteriaBuilder.equal(root.get("title"), "android");
//
//                return pre;
//            }
//        };
//
//
//        List<Book> list = (List<Book>) bookSpecificationExecutor.findAll(spec);
//        System.out.println("list " + list.toString());
//    }
//
//
//    /**
//     * testBookSpecificationExecutor1 单条件
//     */
//
//    @Test
//    public void testBookSpecificationExecutor2() {
//
//
//        /**
//         *  SpecificationExecutor<Book>  用于封装查询条件
//         */
//
//        Specification<Book> spec = new Specification<Book>() {
//
//            /**
//             *
//             * @param root  查询对象属性封装
//             * @param criteriaQuery 封装了我们要执行的查询条件各部分信息  select form order
//             * @param criteriaBuilder 查询条件的构造器 定义不同的查询条件
//             * @return
//             */
//
//            @Override
//            public Predicate toPredicate(Root<Book> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
//                //  where name=“张三”;
//                /**
//                 * param1: 查询的条件属性
//                 * param2: 条件值
//                 */
//                Predicate pre1 = criteriaBuilder.equal(root.get("title"), "android");
//                Predicate pre2 = criteriaBuilder.equal(root.get("num"), 20);
//
//                List<Predicate> list = new ArrayList<>();
//                list.add(pre1);
//                list.add(pre2);
//
//                Predicate[] arr= new Predicate[list.size()];
//
//                return criteriaBuilder.and(list.toArray(arr));
//            }
//        };
//
//
//        List<Book> list = (List<Book>) bookSpecificationExecutor.findAll(spec);
//        System.out.println("list " + list.toString());
//    }
//
//
//
//
//    @Test
//    public void testBookSpecificationExecutor3() {
//
//
//        /**
//         *  SpecificationExecutor<Book>  用于封装查询条件
//         */
//        Specification<Book> spec = new Specification<Book>() {
//
//            /**
//             *
//             * @param root  查询对象属性封装
//             * @param criteriaQuery 封装了我们要执行的查询条件各部分信息  select form order
//             * @param cb 查询条件的构造器 定义不同的查询条件
//             * @return
//             */
//
//            @Override
//            public Predicate toPredicate(Root<Book> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
//                //  where name=“张三”;
//                /**
//                 * param1: 查询的条件属性
//                 * param2: 条件值
//                 */
//                return cb.and(cb.equal(root.get("title"), "android"),cb.equal(root.get("num"), 20));
//            }
//        };
//
//
//        List<Book> list = (List<Book>) bookSpecificationExecutor.findAll(spec);
//        System.out.println("list " + list.toString());
//    }
//
//
//
//
//}
