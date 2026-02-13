package com.assignment.restful_with_springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.restful_with_springboot.model.Employee;
import com.assignment.restful_with_springboot.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    // For Solution 2
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    // For Solution 3
    @GetMapping
    public List<Employee> getAll() {
        return service.getAll();
    }

    // For Solution 4
    @GetMapping("/{id}")
    public Employee getOne(@PathVariable Long id) {
        return service.getById(id);
    }

    // For Solution 5
    // @PostMapping
    // public Employee create(@RequestBody Employee emp) {
    //     return service.save(emp);
    // }

    // For Solution 7
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    // For Solution 8
    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id,
                        @RequestBody Employee emp) {
        return service.update(id, emp);
    }

    
    // For Solution 9
    @PostMapping
    public Employee create(@Valid @RequestBody Employee emp) {
        return service.save(emp);
    }



}
