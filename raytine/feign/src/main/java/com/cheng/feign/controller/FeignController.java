package com.cheng.feign.controller;

import com.cheng.feign.service.UserFeignService;
import com.cheng.feign.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author NianCheng
 * @Date 2020/3/20 12:59
 */
@RestController
public class FeignController {
    @Autowired
    private UserFeignService userFeignService;

    @RequestMapping("user/{username}/{password}")
    public JsonResult register(@PathVariable String username, @PathVariable String password) {
        return userFeignService.register(username, password);
    }
}
