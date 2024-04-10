package com.example.day1cw1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @RequestMapping("/welcome")
    public String func()
    {
        return "Welcome to Spring Boot!";
    }
}
