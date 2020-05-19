package com.geetest.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoubing
 * @date 2020-05-14 09:49
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello jenkins second!";
    }

    @RequestMapping("/changed")
    public String changed(){
        return "changed!   hhh success!";
    }

    @RequestMapping("/push/demo")
    public String pushDemo(){
        return "push success";
    }
}
