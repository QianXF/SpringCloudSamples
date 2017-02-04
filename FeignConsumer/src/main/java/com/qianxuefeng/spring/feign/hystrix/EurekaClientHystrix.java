package com.qianxuefeng.spring.feign.hystrix;

import com.qianxuefeng.spring.feign.client.EurekaClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class EurekaClientHystrix implements EurekaClient {
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}