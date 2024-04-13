package com.example.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountController {
    @RequestMapping("/video/123456.mp4")
    public String index(HttpServletRequest request)
    {
        ServletContext context = request.getServletContext();
        Integer count = (Integer) context.getAttribute("count");
        return " 当前访问量：" + count;
    }

}
