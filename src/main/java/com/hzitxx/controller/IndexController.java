package com.hzitxx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/test")
    public String test(){
        return "你好，世界!";
    }

    @GetMapping("/helloworld")
    public String hellowold(){
        return "helloworld!";
    }
    
    @GetMapping("/findOne")
    public String findOne(){
        return "查询用户！";
    }
}
