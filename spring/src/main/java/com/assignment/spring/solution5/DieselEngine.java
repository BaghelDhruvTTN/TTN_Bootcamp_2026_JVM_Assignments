package com.assignment.spring.solution5;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine {

    @Override
    public String getType() {
        return "Diesel Engine";
    }
}
