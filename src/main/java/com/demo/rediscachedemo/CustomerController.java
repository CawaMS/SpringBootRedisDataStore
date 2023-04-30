package com.demo.rediscachedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
