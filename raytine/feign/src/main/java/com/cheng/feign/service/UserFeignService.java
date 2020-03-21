package com.cheng.feign.service;

import com.cheng.feign.util.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author NianCheng
 * @Date 2020/3/20 13:00
 */
@FeignClient(name = "user", fallback = UserServiceFB.class)
public interface UserFeignService {

    @RequestMapping("user/register/{username}/{password}")
    JsonResult register(@PathVariable String username, @PathVariable String password);
}
