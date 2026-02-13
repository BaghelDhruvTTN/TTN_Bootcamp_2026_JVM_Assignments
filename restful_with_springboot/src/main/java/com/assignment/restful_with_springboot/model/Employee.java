package com.assignment.restful_with_springboot.model;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

    private Long id;

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Min(value = 18, message = "Age must be >= 18")
    @Max(value = 60, message = "Age must be <= 60")
    private int age;

    
}
