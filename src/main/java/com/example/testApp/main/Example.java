package com.example.testApp.main;

import com.example.testApp.bean.Vehicle;
import com.example.testApp.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {
    public static void main(String[]args){

      var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
      Vehicle vehicle = context.getBean(Vehicle.class);
      vehicle.setName("mercedes");
      System.out.println("component vehicle name from spring context is "+vehicle.getName());
      vehicle.printHello();
//test

    }
}
