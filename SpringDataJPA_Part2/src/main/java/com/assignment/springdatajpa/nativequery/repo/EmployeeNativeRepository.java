package com.assignment.springdatajpa.nativequery.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.assignment.springdatajpa.nativequery.entity.EmployeeNative;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeNativeRepository
        extends JpaRepository<EmployeeNative, Long> {

    @Query(value = """
        SELECT id, first_name, age
        FROM employee_native
        WHERE last_name LIKE %:suffix
    """, nativeQuery = true)
    List<Object[]> findLastNameEndsWith(String suffix);


    @Modifying
    @Transactional
    @Query(value = """
        DELETE FROM employee_native
        WHERE age > :age
    """, nativeQuery = true)
    int deleteOlderThan(int age);
}

