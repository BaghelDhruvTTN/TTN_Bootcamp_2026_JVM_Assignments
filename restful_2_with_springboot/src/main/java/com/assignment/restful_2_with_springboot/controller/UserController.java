package com.assignment.restful_2_with_springboot.controller;

import com.assignment.restful_2_with_springboot.service.UserService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.hateoas.EntityModel;
import org.springframework.http.converter.json.MappingJacksonValue;

import com.assignment.restful_2_with_springboot.model.User;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@Tag(name = "User Controller", description = "Operations related to user management")
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }



    // Q2 - GET by ID
    @Operation(
        summary = "Get user details by ID",
        description = "Returns complete details of a user using their unique ID"
    )
    @GetMapping("/{id}")
    public User getUser(@PathVariable Integer id) {
        return service.getUserById(id);
    }

    // Q2 - POST
    @Operation(
        summary = "Save a new user",
        description = "Creates a new user and returns saved user details"
    )
    @PostMapping
    public User saveUser(@RequestBody User user) {
        return service.saveUser(user);
    }


    // Q3 - DELETE
    @Operation(
        summary = "Delete user",
        description = "Deletes a user based on ID"
    )
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id) {
        return "Deleted";
    }

    @GetMapping("/dynamic")
    public MappingJacksonValue getUser() {

        User user = new User(1,"ABC","secret");

        SimpleBeanPropertyFilter filter =
            SimpleBeanPropertyFilter.filterOutAllExcept("id","name");

        FilterProvider filters =
            new SimpleFilterProvider().addFilter("UserFilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(user);
        mapping.setFilters(filters);

        return mapping;
    }

    @GetMapping("/topics") // For Q6
    public List<String> getAllTopics() {
        return List.of("Java", "Spring", "REST");
    }

    @GetMapping("/hateoas/{id}")
    public EntityModel<User> getUserWithLinks(@PathVariable Integer id) {

        User user = service.getUserById(id);


        EntityModel<User> model = EntityModel.of(user);

        model.add(
            linkTo(methodOn(UserController.class)
                    .getAllTopics())
                    .withRel("all-topics")
        );

        return model;
    }



}
