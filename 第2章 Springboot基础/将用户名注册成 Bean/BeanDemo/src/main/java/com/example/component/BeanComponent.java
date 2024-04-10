package com.example.component;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanComponent {
    @Bean
    public String name()
    {
        return "张三";
    }
}
