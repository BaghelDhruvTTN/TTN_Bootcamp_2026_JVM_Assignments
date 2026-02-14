package com.assignment.restful_2_with_springboot.versioning;

public class UserV2 {

    private String name;
    private String email;

    public UserV2(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
