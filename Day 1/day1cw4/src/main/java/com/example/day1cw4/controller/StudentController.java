package com.example.day1cw4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day1cw4.model.AddressModel;

@RestController
public class StudentController {
    @GetMapping("/path")
    public AddressModel getMethodName() {
        AddressModel obj = new AddressModel("Main St", 123, null, 0, null, null, null, null);
        return obj;
    }
    
}
