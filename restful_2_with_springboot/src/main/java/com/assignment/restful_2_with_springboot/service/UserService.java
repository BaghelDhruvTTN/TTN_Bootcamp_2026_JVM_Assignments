package com.assignment.restful_2_with_springboot.service;

import com.assignment.restful_2_with_springboot.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUserById(Integer id) {
        return new User(id, "Dhruv", "a@b.com");
    }

    public User saveUser(User user) {
        return user;
    }
}
