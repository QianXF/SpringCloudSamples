package com.qianxuefeng.spring.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class TestController {
    @Value("${config-repo}")
    private String config;
    @RequestMapping("/config")
    public String from() {
        return this.config;
    }
}