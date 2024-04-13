package com.example.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/index")
    public String index()
    {
        return " 这里是主页 ";
    }
    @RequestMapping("/login")
    public String login(HttpServletRequest request)
    {
        request.setAttribute("value", " 登录前在这里保存了一些值 ");// 向请求中插入一个属性值
        return " 这里是登录页 ";
    }
}
