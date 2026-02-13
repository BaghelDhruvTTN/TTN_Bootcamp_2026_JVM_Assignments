package com.assignment.restful_with_springboot.service;

import org.springframework.stereotype.Service;

import com.assignment.restful_with_springboot.exception.ResourceNotFoundException;
import com.assignment.restful_with_springboot.model.Employee;

import java.util.*;

@Service
public class EmployeeService {

    private Map<Long, Employee> db = new HashMap<>();

    // For Solution 3
    public List<Employee> getAll() {
        return new ArrayList<>(db.values());
    }

    // For Solution 4
    // public Employee getById(Long id) {
    //     return db.get(id);
    // }

    // For Solution 5
    public Employee save(Employee emp) {
        db.put(emp.getId(), emp);
        return emp;
    }

    // For Solution 6
    public Employee getById(Long id) {
        return Optional.ofNullable(db.get(id))
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found"));
    }
    
    // For Solution 7
    public void delete(Long id) {
        if (!db.containsKey(id))
            throw new ResourceNotFoundException("Employee not found");
    
        db.remove(id);
    }

    // For Solution 8
    public Employee update(Long id, Employee emp) {
        if (!db.containsKey(id))
            throw new ResourceNotFoundException("Employee not found");
    
        emp.setId(id);
        db.put(id, emp);
        return emp;
    }
    
    
    
    
}
