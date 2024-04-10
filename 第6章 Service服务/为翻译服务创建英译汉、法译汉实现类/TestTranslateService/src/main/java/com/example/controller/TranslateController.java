package com.example.controller;

import com.example.service.TranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslateController {
    @Autowired
    TranslateService english2ChineseImpl;
    @Autowired
    TranslateService french2ChineseImpl;
    @RequestMapping("/english")
    public String english(String word)
    {
        return english2ChineseImpl.translate(word);

    }
    @RequestMapping("/frence")
    public String french(String word)
    {
        return french2ChineseImpl.translate(word);

    }
}
