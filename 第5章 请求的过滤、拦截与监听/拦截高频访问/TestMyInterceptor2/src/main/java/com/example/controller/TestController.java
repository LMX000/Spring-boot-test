package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TestController {
    @RequestMapping("/time")
    public String time()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss SSS");
        return " 当前时间：" + sdf.format(new Date());

    }
    @RequestMapping("/index")
    public String index()
    {
        return " 欢迎来到 XXXX";

    }

}
