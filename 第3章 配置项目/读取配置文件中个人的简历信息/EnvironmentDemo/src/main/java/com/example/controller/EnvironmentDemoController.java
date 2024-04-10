package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RestController
public class EnvironmentDemoController {
    @Autowired
    private Environment env;
    @RequestMapping("/env")
    public String env() throws UnsupportedEncodingException {
    StringBuilder report=new StringBuilder();
    if(env.containsProperty("com.example.name"))
    {
        String name=env.getProperty("com.example.name");
        String name1=new String(name.getBytes("iso8859-1"),"utf-8");
        report.append("<li>姓名："+name1+"</li>");
    }
    if(env.containsProperty("com.example.age"))
    {
       int age=env.getProperty("com.example.age",Integer.class);
        report.append("<li>年龄："+age+"</li>");
    }
    String school=env.getProperty("com.example.school","重二师");
        report.append("<li>学校："+school+"</li>");
        String subject = env.getProperty("com.example.subject", " 编程 ");
        report.append("<li> 所学课程：" + subject + "</li>");
        return report.toString();


    }
}
