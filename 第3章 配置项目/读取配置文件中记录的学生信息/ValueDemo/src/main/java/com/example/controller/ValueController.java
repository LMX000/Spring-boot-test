package com.example.controller;

import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RestController
public class ValueController {
@Value("${com.example.name}")
    private String name;
@Value("${com.example.age}")
    private Integer age;
@Value("${com.example.gender}")
    private String gender;
@RequestMapping("/people")
public String getPeople() throws UnsupportedEncodingException {
    StringBuilder report=new StringBuilder();
    String name1=new String(name.getBytes("iso8859-1"),"utf-8");
    String gender1=new String(gender.getBytes("iso8859-1"),"utf-8");
    report.append("<li> 名称:"+name1+"</li>");
    report.append("<li> 年龄:"+age+"</li>");
    report.append("<li> 性别:"+gender1+"</li>");
    return report.toString();
}
}
