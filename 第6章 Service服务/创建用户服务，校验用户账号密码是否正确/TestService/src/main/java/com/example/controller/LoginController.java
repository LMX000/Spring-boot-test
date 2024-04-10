package com.example.controller;

import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    UserService service;
    @RequestMapping("/login")
    public String login(String username, String password)
    {
        if (service.check(username, password))
        {
            return " 登录成功 ";
        }
        else {
            return " 用户名或密码错误 ";

        }
    }
}
