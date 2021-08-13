package com.springcore.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//One way to create bean
//@Component
public class College {
String name ="shisab";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void test(){
        System.out.println("testing method ");
    }
}
