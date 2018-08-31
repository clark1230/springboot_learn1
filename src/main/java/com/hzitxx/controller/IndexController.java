package com.hzitxx.controller;

import com.hzitxx.entity.User;
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

    @GetMapping("/userList")
    public String userList(){
        return "用户列表";
    }
    @GetMapping("/removeUser")
    public String removeUser(){
        return  "删除用户";
    }

    @GetMapping("/nice")
    public String nice(){
        return "nice";
    }

    @GetMapping("/showUser")
    public User showUser(){
        return new User(1,"jack","男");
    }
}
