package com.assignment.restful_2_with_springboot.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/hello")
    public String getMessage(
            @RequestParam String username,
            @RequestParam(defaultValue = "en") String lang) {

        Locale locale = new Locale(lang);
        return messageSource.getMessage(
                "greeting.message",
                new Object[]{username},
                locale);
    }
}
