package com.example.testApp.config;

import com.example.testApp.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean(value="audiVehicle")
    Vehicle vehicle1 (){
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }
    @Bean(value="mercedesVehicle")
    Vehicle vehicle2 (){
        var veh = new Vehicle();
        veh.setName("mercedes");
        return veh;
    }

    @Bean
    String hello(){
        return "hello ,i m bean hello";
    }
    @Bean
    String saludos(){
        return "saludos";
    }

    @Bean
    int number(){
        return 16;
    }
}
