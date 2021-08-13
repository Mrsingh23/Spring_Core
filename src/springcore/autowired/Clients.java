package springcore.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Clients {
    public static void main(String[] args){
        //defines the configuration file for Spring. Used when beans.xml is used for config
       // ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

     //   this one if you use Java for configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        College college = context.getBean("college", College.class);
        college.test();

    }
}
