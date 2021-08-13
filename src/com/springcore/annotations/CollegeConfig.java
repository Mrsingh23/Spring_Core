package com.springcore.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

//this is only used when @component is use to create college bean
// @ComponentScan(basePackages = "com.springcore.annotations")

public class CollegeConfig {

    @Bean
    public College collegeBean() //method name is bean name/id
    {
        College college = new College();
        System.out.println("Message from CollegeConfig.class");
        return college;
    }
}
