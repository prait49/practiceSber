package org.example;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
public class ResourceLoaderService implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void showResourceDataUsingFilePath() {
        try {
            Resource resource = resourceLoader.getResource("classpath:resources/users.txt");

            if (resource.exists() && resource.isReadable()) {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    System.err.println("Error reading the file: " + e.getMessage());
                }
            } else {
                System.err.println("The file doesn't exist or is not readable.");
            }
        } catch (Exception e) {
            System.err.println("Error loading the resource: " + e.getMessage());
        }
    }
}