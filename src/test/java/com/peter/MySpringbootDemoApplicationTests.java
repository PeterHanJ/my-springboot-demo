package com.peter;

import com.peter.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MySpringbootDemoApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ctx;

    @Test
    void testHelloService(){
        boolean isContains = ctx.containsBean("helloService02");
        System.out.println("Spring contains helloService bean is :" + isContains);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
