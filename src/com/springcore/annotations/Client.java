package com.springcore.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args){
        //defines the configuration file for Spring. Used when beans.xml is used for config
       // ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

     //   this one if you use Java for configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        College college = context.getBean("collegeBean", College.class);
        college.test();
        college.setName("ravi ");
        System.out.println("hi "+ college.getName());


//
//        ApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
//        College college = context.getBean("collegeBeanPart2", College.class);
//        college.test();
//        System.out.println("hi "+ college.getName());
    }
}
