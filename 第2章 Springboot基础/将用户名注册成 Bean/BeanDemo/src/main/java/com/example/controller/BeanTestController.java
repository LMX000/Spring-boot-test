package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanTestController {
    @Autowired
    private String name;
    @RequestMapping("/bean")
    public String showName()
    {
        return "张三";
    }

}
