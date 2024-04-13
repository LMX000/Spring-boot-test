package com.example.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping("/index")
    public String index(HttpServletRequest request)
    {
        request.getSession();// 主动调用 session 对象，触发创建 session 的事件
        ServletContext context = request.getServletContext();
        Integer count = (Integer) context.getAttribute("count");
        return " 当前在线人数 :" + count;
    }

}
