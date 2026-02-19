package com.assignment.springdatajpa.inheritance.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("DEVELOPER")
@Getter
@Setter
public class Developer extends EmployeeBase {

    private String programmingLanguage;

}

