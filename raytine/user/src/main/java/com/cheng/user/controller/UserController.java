package com.cheng.user.controller;

import com.cheng.user.service.OrderFeignService;
import com.cheng.user.util.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * @Description
 * @Author NianCheng
 * @Date 2020/3/17 12:48
 */
@Controller
@Slf4j
@RequestMapping("user")
public class UserController {

    @Value("${server.port}")
    private int port;

    @Autowired
    private OrderFeignService orderFeignService;
    /*
     * 注册
     */
    @ResponseBody
    @RequestMapping("register/{username}/{password}")
    public JsonResult register(@PathVariable String username, @PathVariable String password) throws InterruptedException {
        log.info(port + ", " + username + ", " + password);
        JsonResult js = new JsonResult();

        orderFeignService.queryOrderById("1");

        ///--设置随机延迟
        if(Math.random()<0.6) {
            long t = new Random().nextInt(4000);
            log.info("item-service-"+port+" - 暂停 "+t);
            Thread.sleep(t);
        }

        js.setMessage("注册成功！"+ port);
        js.setSuccess(true);
        return js;
    }

    @RequestMapping("login/{username}/{password}")
    @ResponseBody
    public JsonResult login(@PathVariable String username, @PathVariable String password) {
        JsonResult js = new JsonResult();
        log.info(port + ", " + username + ", " + password);
        js.setMessage("登录成功");
        js.setSuccess(true);
        return js;
    }
}
