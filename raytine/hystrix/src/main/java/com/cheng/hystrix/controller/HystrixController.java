package com.cheng.hystrix.controller;

import com.cheng.hystrix.util.JsonResult;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author NianCheng
 * @Date 2020/3/20 9:03
 */
@RestController
@RequestMapping("hystrix")
public class HystrixController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("user/register/{username}/{password}")
    @HystrixCommand(fallbackMethod = "registerFB")
    public JsonResult register(@PathVariable String username, @PathVariable String password) {
        return restTemplate.getForObject("http://user/user/register/{0}/{1}", JsonResult.class, username, password);
    }

    public JsonResult registerFB(@PathVariable String username, @PathVariable String password) {
        JsonResult js = new JsonResult();
        js.setMessage("注册失败");
        return js;
    }

}
