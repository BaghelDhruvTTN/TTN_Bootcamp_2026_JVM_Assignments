package com.assignment.springdatajpa.inheritance.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.springdatajpa.inheritance.entity.EmployeeBase;

@Repository
public interface EmployeeInheritanceRepository
        extends JpaRepository<EmployeeBase, Long> {
}

