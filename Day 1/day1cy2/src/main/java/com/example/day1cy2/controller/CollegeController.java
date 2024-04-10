package com.example.day1cy2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.day1cy2.model.College;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class CollegeController {
    @GetMapping("/college")
    public College getMethodName() {
        College obj = new College("ABC College", "Computer Science", 1);
        return obj;
    }
    
}
