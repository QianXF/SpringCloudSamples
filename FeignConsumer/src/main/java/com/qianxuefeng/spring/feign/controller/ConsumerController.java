package com.qianxuefeng.spring.feign.controller;

import com.qianxuefeng.spring.feign.client.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    EurekaClient eurekaClient;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return eurekaClient.add(10, 20);
    }
}