package com.example.day2cy.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.day2cy.model.Department;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class DepartmentController {
    @PostMapping("/department")
    public String postMethodName(@RequestBody Department entity) {
        return "Department Name: "+entity.getDepartmentName()+", Branch: "+entity.getBranch();
    }
    
}