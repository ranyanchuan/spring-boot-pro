package com.yyan.serviceImpl;

import com.yyan.dao.MenuDao;
import com.yyan.pojo.Menu;
import com.yyan.service.MenuService;
import com.yyan.utils.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

@Service
public class MenuServiceImpl extends BaseServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    /**
     * 批量插入菜单
     *
     * @param list
     */
    @Override
    @Transactional
    public void insertListMenu(List<Menu> list) {

        this.menuDao.insertListMenu(list);
    }


    /**
     * 批量查询菜单
     *
     * @param map
     * @return
     */
    @Override
    public Map<String, Object> selectListMenu(Map map) {
        List<Menu> list = this.menuDao.selectListMenu(map); // 查询数据库
        Integer count = this.menuDao.countListMenu(map);
        return this.queryListSuccess(list, count, map); //查询成功
    }

    /**
     * 批量更新菜单
     *
     * @param list
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class) // 事务回滚
    public void updateListMenu(List<Menu> list) {
        this.menuDao.updateListMenu(list);
    }

    /**
     * 批量删除菜单
     *
     * @param list
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class) // 事务回滚
    public void deleteListMenu(List<Menu> list) {
        this.menuDao.deleteListMenu(list);
    }
}
