package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/login")
    public String login(@RequestParam(value = "name",defaultValue="游客") String username)
    {
        return username + " 您好，欢迎光临 XXX 网站 ";

    }
}
