package com.assignment.springdatajpa.jpql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee_jpql")
@Getter
@Setter
public class EmployeeJPQL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="empFirstName")
    private String firstName;

    @Column(name="empLastName")
    private String lastName;

    @Column(name="empSalary")
    private double salary;

    @Column(name="empAge")
    private int age;

}

