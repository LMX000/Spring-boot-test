package com.example.component;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserComponent {
    @Bean
public Map<String,String> users()
{
    Map<String, String> map = new HashMap<>();
    map.put("10", " 张三 ");
    map.put("20", " 李四 ");
    map.put("30", " 王五 ");
    return map;
}
}
