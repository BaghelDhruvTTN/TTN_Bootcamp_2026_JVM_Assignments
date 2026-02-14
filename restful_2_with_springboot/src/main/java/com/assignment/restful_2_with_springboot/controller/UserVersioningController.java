package com.assignment.restful_2_with_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.restful_2_with_springboot.versioning.UserV1;
import com.assignment.restful_2_with_springboot.versioning.UserV2;

@RestController
@RequestMapping("/versioning")
public class UserVersioningController {
    
    // URI Versioning
    @GetMapping("/v1/user")
    public UserV1 getUserV1() {
        return new UserV1("abc");
    }

    @GetMapping("/v2/user")
    public UserV2 getUserV2() {
        return new UserV2("abc", "abc@test.com");
    }

    // Request Parameter Versioning
    @GetMapping(value = "/user", params = "version=1")
    public UserV1 getUserParamV1() {
        return new UserV1("abc");
    }

    @GetMapping(value = "/user", params = "version=2")
    public UserV2 getUserParamV2() {
        return new UserV2("abc", "abc@test.com");
    }

    // Custom Header Versioning
    @GetMapping(value = "/user", headers = "X-API-VERSION=1")
    public UserV1 getUserHeaderV1() {
        return new UserV1("abc");
    }
    
    @GetMapping(value = "/user", headers = "X-API-VERSION=2")
    public UserV2 getUserHeaderV2() {
        return new UserV2("abc", "abc@test.com");
    }

    // MIME Type Versioning
    @GetMapping(
        value = "/user",
        produces = "application/vnd.company.app-v1+json"
    )
    public UserV1 getUserMimeV1() {
        return new UserV1("abc");
    }
    
    @GetMapping(
        value = "/user",
        produces = "application/vnd.company.app-v2+json"
    )
    public UserV2 getUserMimeV2() {
        return new UserV2("abc", "abc@test.com");
    }
        
}
