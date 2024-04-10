package com.example.day1cy1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.day1cy1.model.Family;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class FamilyController {
     @GetMapping("/family")
    public List<Family> getMethodName() {
        List<Family> list = new ArrayList<Family>();
        Family obj = new Family("John",20,"Brother");
        list.add(obj);
        return list;
    }
    
    
}
