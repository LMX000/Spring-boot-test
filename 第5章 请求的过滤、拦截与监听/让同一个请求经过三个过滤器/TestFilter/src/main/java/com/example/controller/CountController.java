package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountController {
    @RequestMapping("/index")
    public String index()
    {
        return " 欢迎来到 XXX";
    }
}
