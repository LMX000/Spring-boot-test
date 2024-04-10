package com.example;

import com.example.model.People;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeanMethodDemoApplicationTests {
 @Autowired
    People someone;
    @Test
    void contextLoads() {
        someone.hello();
    }

}
