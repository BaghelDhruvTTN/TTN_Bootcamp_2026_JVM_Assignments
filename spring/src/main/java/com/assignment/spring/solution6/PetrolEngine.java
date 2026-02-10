package com.assignment.spring.solution6;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements Engine {

    @Override
    public String getType() {
        return "Petrol Engine";
    }
}
