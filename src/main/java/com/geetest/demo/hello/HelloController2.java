package com.geetest.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoubing
 * @date 2020-05-14 09:56
 */
@RestController
public class HelloController2 {
    @RequestMapping("/hello/people")
    public String hello() {
        return "hello jenkins";
    }
}
