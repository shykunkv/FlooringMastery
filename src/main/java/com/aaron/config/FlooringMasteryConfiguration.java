package com.aaron.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {
        "com.aaron.dao",
        "com.aaron.service",
        "com.aaron.view",
        "com.aaron.controller",
})
public class FlooringMasteryConfiguration {

}
