package com.assignment.spring.solution3;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Petrol engine started");
    }
}
