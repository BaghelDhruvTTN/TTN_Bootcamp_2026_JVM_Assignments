package com.assignment.spring.solution4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private String model = "Tesla X";
    private int year = 2026;

    @Autowired
    private Engine engine;

    public void displayProperties() {
        System.out.println("Car Model : " + model);
        System.out.println("Manufacture Year : " + year);
        System.out.println("Engine Type : " + engine.getType());
    }
}
