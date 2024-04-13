package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/main/index")
    public String index()
    {
        return " 欢迎来到 XXX 网站 ";
    }
    @RequestMapping("/login")
    public String login()
    {
        return " 请先登录您的账号！ ";
    }
}
