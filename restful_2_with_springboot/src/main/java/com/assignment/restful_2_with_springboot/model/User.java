package com.assignment.restful_2_with_springboot.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Represents a user in the system")
@JsonFilter("UserFilter")
public class User {

    @Schema(description = "Unique ID of the user", example = "1")
    private Integer id;

    @Schema(description = "Full name of the user", example = "ABC")
    private String name;

    @Schema(description = "Email address of the user", example = "ABC@test.com")
    private String email;
    
    @JsonIgnore // For Q4
    @Schema(description = "Password (hidden in responses)", example = "secret")
    private String password;


    public User(){}

    public User(Integer id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
 
}
