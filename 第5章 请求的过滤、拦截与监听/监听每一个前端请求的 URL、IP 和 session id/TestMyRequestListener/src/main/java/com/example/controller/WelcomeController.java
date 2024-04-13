package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping("/index")
    public String index()
    {
        return " 欢迎来到 XXXX";
    }

}
