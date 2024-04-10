package com.example.day1cw2.controller;



import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ApiController {
    @GetMapping("/students/{name}")
    public String getMethodName(@PathVariable("name") String studentName) {
        return "welcome"+" "+studentName;
    }
    
}
