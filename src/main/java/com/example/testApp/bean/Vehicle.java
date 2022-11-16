package com.example.testApp.bean;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printHello(){
        System.out.println("printing hello from Component Vehicle bean");
    }

    private String name;

}
