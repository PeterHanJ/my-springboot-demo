package com.peter.config;

import com.peter.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This is a java configuration
 */
@Configuration
public class AppBeanConfig {

    /**
     * To add bean into Spring Context
     * Return type is bean type (HelloService)
     * method name is bean id (helloService02)
     * @return
     */
    @Bean
    public HelloService helloService02(){
        System.out.println("load helloService!");
        return new HelloService();
    }
}
