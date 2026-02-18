package com.assignment.springdatajpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.springdatajpa.entity.Employee;
import com.assignment.springdatajpa.repository.EmployeeRepository;

import org.springframework.data.domain.*;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    // For 3rd Question
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    
    // For 4th Question
    public Employee updateEmployee(Long id, Employee newData) {
        
        Employee emp = repository.findById(id).orElseThrow();
        
        emp.setName(newData.getName());
        emp.setAge(newData.getAge());
        emp.setLocation(newData.getLocation());
        
        return repository.save(emp);
    }
    
    // For 5th Question
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }

    // For 6th Question
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // For 7th Question
    public long countEmployees(){
        return repository.count();
    }
    
    // For 8th Question
    public Page<Employee> getEmployeesPaginated(int page, int size) {

        Pageable pageable =
            PageRequest.of(page, size, Sort.by("age").ascending());
    
        return repository.findAll(pageable);
    }

}
