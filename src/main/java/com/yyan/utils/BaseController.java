package com.yyan.utils;


import com.alibaba.druid.support.json.JSONUtils;

import java.util.HashMap;
import java.util.Map;

public class BaseController {


    // 成功
    public Map<String, Object> buildSuccess(Object data) {
        Map<String, Object> map = new HashMap();
        ResultCodeEnum resultCode = ResultCodeEnum.SUCCESS;
        map.put("code", resultCode.getCode());
        map.put("info", resultCode.getMessage());
        map.put("data", data);
        return map;
    }

    // 失败
    public Map<String, Object> buildError(String message) {
        Map map = new HashMap();
        ResultCodeEnum resultCode = ResultCodeEnum.FAILED;
        map.put("code", resultCode.getCode());
        if (message == null || message.isEmpty()) {
            map.put("info", resultCode.getMessage());
        } else {
            map.put("info", message);
        }
        return map;
    }

}
