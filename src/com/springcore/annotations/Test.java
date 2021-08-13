package com.springcore.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

//this is only used when @component is use to create college bean
// @ComponentScan(basePackages = "com.springcore.annotations")

public class Test {


    @Bean

    public College collegeBeanPart2() //method name is bean name/id
    {
        College college = new College();
        System.out.println("this is from test.class");
        college.setName("setting Name from test.class");
        return college;
    }
}
