package com.cheng.user.service;

import com.cheng.user.util.JsonResult;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author NianCheng
 * @Date 2020/3/21 18:16
 */
@Component
public class OrderServiceFB implements OrderFeignService {

    @Override
    public JsonResult queryOrderById(String id) {
        return new JsonResult(false, "查询失败！", null);
    }
}
