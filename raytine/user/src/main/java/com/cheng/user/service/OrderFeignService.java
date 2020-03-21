package com.cheng.user.service;

import com.cheng.user.util.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author NianCheng
 * @Date 2020/3/21 13:27
 */
@FeignClient(name = "order")
public interface OrderFeignService {

    @RequestMapping("order/queryOrder/{id}")
    JsonResult queryOrderById(@PathVariable String id);
}
