package com.cheng.ribbon.controller;

import com.cheng.ribbon.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author NianCheng
 * @Date 2020/3/17 16:19
 */
@ResponseBody
@Controller
@RequestMapping("ribbon")
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("user/register/{username}/{password}")
    public JsonResult register(@PathVariable String username, @PathVariable String password) {
        return restTemplate.getForObject("http://user/user/register/{1}/{2}", JsonResult.class, username, password);
    }

    @RequestMapping("order/queryOrderById/{id}")
    public JsonResult queryOrderById(@PathVariable String id){
        return restTemplate.getForObject("http://order/order/queryOrder/{1}", JsonResult.class, id);
    }
}
