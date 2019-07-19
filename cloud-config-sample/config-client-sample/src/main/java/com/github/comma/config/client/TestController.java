package com.github.comma.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangfuchu
 * @desciption
 * @date 2019/7/19
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${config.client.test}")
    private String test;

    @RequestMapping("test")
    public String test(){
        return "hello, " + test;
    }
}
