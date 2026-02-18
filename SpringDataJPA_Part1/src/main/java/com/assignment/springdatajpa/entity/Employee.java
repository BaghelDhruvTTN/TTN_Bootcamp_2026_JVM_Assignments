package com.assignment.springdatajpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    private String location;

    public Employee() {}

    public Employee(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

}
