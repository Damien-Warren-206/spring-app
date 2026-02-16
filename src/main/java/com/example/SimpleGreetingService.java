package com.example;

import org.springframework.stereotype.Service;

@Service
public class SimpleGreetingService implements GreetingService {

    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, World simply!";
        }
        return "Hello, " + name + " simply!";
    }
}


