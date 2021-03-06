package com.yyan.utils;


import com.yyan.pojo.Role;
import org.springframework.cglib.beans.BeanMap;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;


public class BaseServiceImpl {

    //  查询成功数据组装
    public Map<String, Object> queryListSuccess(Object data, Integer count, Map param) {
        Map<String, Object> map = new HashMap<>();
        map.put("data", data);
        map.put("pageIndex", param.get("pageIndex"));
        map.put("size", param.get("size"));
        map.put("count", count);
        return map;
    }

    //  去掉实体中没有必要的字段
    public List<?> queryListClearField(List<?> list, String[] arr) {
        List<Map<String, Object>> newList = new ArrayList<>();
        for (Object object : list) {
            Map<String, Object> map = new HashMap<>();
            map.putAll(BeanMap.create(object));
            for (String key : arr) {
                map.remove(key);// 去掉不必要的字段
            }
            newList.add(map);
        }
        return newList;
    }


    /**
     * 批量插入数据，为数据添加 id,createTime,updateTime
     *
     * @param list
     * @return
     */
    public List<?> insertListBefore(List<?> list) {
        List<Map<String, Object>> newList = new ArrayList<>();
        for (Object object : list) {
            Map<String, Object> map = new HashMap<>();
            String id = UUID.randomUUID().toString();
            System.out.println("id" + id);
            map.put("id", id); // 添加 id
            map.put("updateTime", new Date()); // 添加创建时间
            map.put("createTime", new Date()); // 添加修改时间
            newList.add(map);
        }
        return newList;
    }


}
