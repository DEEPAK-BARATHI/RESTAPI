package com.example.day2cw2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day2cw2.model.Student;

@RestController
public class StudentController {
    @GetMapping("/students")
    public Student getMethodName() {
        Student a = new Student("Nithish", 22);
        return a;
    }
    
}
