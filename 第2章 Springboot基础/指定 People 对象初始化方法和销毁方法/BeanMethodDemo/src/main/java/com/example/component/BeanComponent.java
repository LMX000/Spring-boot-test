package com.example.component;

import com.example.model.People;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanComponent {
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public People name()
    {
        return new People("张三");
    }
}
