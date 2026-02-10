package com.assignment.spring.solution3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private Engine engine;  // injected by Spring, field or constructor injection to be specific.

    public void drive() {
        engine.start();
        System.out.println("Car driving...");
    }
}
