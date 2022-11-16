package com.example.testApp.config;

import com.example.testApp.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "package com.example.testApp.bean")
public class ProjectConfig {

}
