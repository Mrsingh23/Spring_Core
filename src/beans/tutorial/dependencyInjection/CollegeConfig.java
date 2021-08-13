package beans.tutorial.dependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration


public class CollegeConfig {

    @Bean
    public Students students()
    {
        return new Students();
    }
    @Bean
    public College collegeBean() //method name is bean name/id
    {
        //calling students method will return Student obj &
        //this is passed to constructor
        //College college = new College(students());
        College college = new College();
        college.setStudents(students());
        System.out.println("Message from CollegeConfig.class");
        return college;
    }
}
