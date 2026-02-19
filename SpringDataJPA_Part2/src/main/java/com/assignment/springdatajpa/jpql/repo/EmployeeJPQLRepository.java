package com.assignment.springdatajpa.jpql.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.assignment.springdatajpa.jpql.entity.EmployeeJPQL;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeJPQLRepository
        extends JpaRepository<EmployeeJPQL, Long> {

    @Query("""
        SELECT e.firstName, e.lastName
        FROM EmployeeJPQL e
        WHERE e.salary > (
            SELECT AVG(e2.salary)
            FROM EmployeeJPQL e2
        )
        ORDER BY e.age ASC, e.salary DESC
    """)
    List<Object[]> findAboveAverageSalary();


    @Modifying
    @Transactional
    @Query("""
        UPDATE EmployeeJPQL e
        SET e.salary = :salary
        WHERE e.salary < (
            SELECT AVG(e2.salary)
            FROM EmployeeJPQL e2
        )
    """)
    int updateSalaryBelowAverage(double salary);


    @Modifying
    @Transactional
    @Query("""
        DELETE FROM EmployeeJPQL e
        WHERE e.salary = (
            SELECT MIN(e2.salary)
            FROM EmployeeJPQL e2
        )
    """)
    int deleteMinimumSalaryEmployees();
}


