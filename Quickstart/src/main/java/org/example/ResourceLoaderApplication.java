package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ResourceLoaderApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ResourceLoaderApplication.class, args);
        ResourceLoaderService resourceLoaderService = context.getBean(ResourceLoaderService.class);
        resourceLoaderService.showResourceDataUsingFilePath();
    }
}