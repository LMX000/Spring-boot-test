package com.example.service.impl;

import com.example.service.TranslateService;

public class English2ChineseImpl implements TranslateService {

    @Override
    public String translate(String word) {
        if ("hello".equalsIgnoreCase(word))
        {
            return "hello -> 你好 ";

        }return " 我还没有学会这个单词，你可以教我吗？ ";
    }
}
