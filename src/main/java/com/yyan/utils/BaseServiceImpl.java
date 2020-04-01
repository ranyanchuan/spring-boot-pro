package com.yyan.utils;


import com.yyan.pojo.Role;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


}
