package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {
        "com.example.dao",
        "com.example.metier",
        "com.example.config"
})
@PropertySource("classpath:app.properties")
public class AppConfig {
    // Configuration principale de Spring
}
