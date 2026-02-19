package com.assignment.springdatajpa.embedded.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Salary {

    private double basicSalary;

    private double bonusSalary;

    private double taxAmount;

    private double specialAllowanceSalary;

}

