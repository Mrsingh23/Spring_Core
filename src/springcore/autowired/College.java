package springcore.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class College {

    @Autowired
    private Students students;


    public void test()
    {
        students.methodOfStd();
    }

}
