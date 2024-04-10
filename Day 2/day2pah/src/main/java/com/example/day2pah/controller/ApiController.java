package com.example.day2pah.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.day2pah.config.AppConfig;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class ApiController {
    @Autowired
    public AppConfig configObject;
    @GetMapping("/info")
    public String getMethodName() {
        return "Student Name: "+configObject.getStudentName()+", Department: "+configObject.getStudentDepartment();
    }
    
}
