package com.assignment.springdatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.assignment.springdatajpa.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // For 9th Question
    Employee findByName(String name);

    // For 10th Question
    List<Employee> findByNameStartingWith(String prefix);

    // For 11th Question
    List<Employee> findByAgeBetween(int start, int end);

}
