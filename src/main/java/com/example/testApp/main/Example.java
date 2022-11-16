package com.example.testApp.main;

import com.example.testApp.bean.Vehicle;
import com.example.testApp.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {
    public static void main(String[]args){

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("vehicle name from spring context is:" +veh.getName() );
        veh = context.getBean("mercedesVehicle", Vehicle.class);
        System.out.println("vehicle name from spring context is:" +veh.getName() );



    }
}
