package com.cheng.feign.service;

import com.cheng.feign.util.JsonResult;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author NianCheng
 * @Date 2020/3/21 12:59
 */
@Component
public class UserServiceFB implements UserFeignService {
    @Override
    public JsonResult register(String username, String password) {

        return new JsonResult(false,"注册失败",null);
    }
}
