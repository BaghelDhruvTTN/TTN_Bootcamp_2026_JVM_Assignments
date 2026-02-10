package com.assignment.spring.solution2;

interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Petrol engine started");
    }
}

class Car {
    private Engine engine;

    Car(Engine engine) {  // dependency injected (Constructor injection to be specific)
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car driving...");
    }
}

public class Solution2 {
    public static void main(String[] args) {
        Engine engine = new PetrolEngine();
        Car car = new Car(engine);
        car.drive();
    }
}

