package com.example.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/login")
   public String login(String username,String password)
   {
       if (username != null && password != null)
       {
           if ("张三".equals(username) && "123456".equals(password))
           {
               return username + "，欢迎回来 ";
           }
       }
       return " 您的账号或密码错误 ";
   }
}
