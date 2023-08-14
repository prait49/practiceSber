package com.example.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResourceLoaderApplication {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        SpringApplication.run(ResourceloaderdemoApplication.class, args);

        // Your code here
    }
}
