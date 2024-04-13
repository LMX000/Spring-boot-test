package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class TestController {
    @Autowired
    Map<String, String> users;
    @GetMapping("/user/{id}")
    @ResponseBody
    public String select(@PathVariable() String id)
    {
        if (users.containsKey(id))
        {
            return " 您好，" + users.get(id);
        }return " 该用户不存在 ";
    }
    @GetMapping("/user")
    @ResponseBody
    public String all()
    {
        StringBuilder report = new StringBuilder();
        for (String id : users.keySet())
        {
            String name = users.get(id);
            report.append("[" + id + ":" + name + "]");
        }return report.toString();
    }
    @PostMapping("/user/{id}/{name}")
    public String add(@PathVariable String id, @PathVariable String name)
    {
        users.put(id, name);
        return "redirect:/user";
    }
    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable() String id)
    {
        users.remove(id);
        return "redirect:/user";
    }




}
