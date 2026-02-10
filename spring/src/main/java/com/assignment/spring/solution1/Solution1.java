package com.assignment.spring.solution1;

class Engine {
    void start() {
        System.out.println("Petrol engine started");
    }
}

class Car {
    private Engine engine = new Engine(); // hard dependency as we are explicitly creating the object.

    void drive() {
        engine.start();
        System.out.println("Car driving...");
    }
}

public class Solution1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
