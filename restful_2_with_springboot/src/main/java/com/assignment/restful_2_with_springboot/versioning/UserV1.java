package com.assignment.restful_2_with_springboot.versioning;

public class UserV1 {

    private String name;

    public UserV1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
