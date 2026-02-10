package com.assignment.spring.solution6;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private final Engine engine;

    // Constructor Injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.println("Driving with: " + engine.getType());
    }
}
