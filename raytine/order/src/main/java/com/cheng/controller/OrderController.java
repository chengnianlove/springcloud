package com.cheng.controller;

import com.cheng.util.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author NianCheng
 * @Date 2020/3/17 14:19
 */
@RequestMapping("order")
@Controller
@Slf4j
public class OrderController {

    @Value("${server.port}")
    private int port;

    @RequestMapping("queryOrder/{id}")
    @ResponseBody
    public JsonResult queryOrderById(@PathVariable String id) {
        log.info("查询订单的id：" + id);
        JsonResult js = new JsonResult();

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add(""+port);

        js.setObj(list);
        js.setSuccess(true);
        return js;
    }

}
