package com.example.day2cw1.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.day2cw1.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class ApiController {
    @Autowired
    private AppConfig appconfig;
    @GetMapping("/info")
    public String getMethodName() {
        return "App Name : "+appconfig.appName+" App Version : "+appconfig.appVersion;
    }
    
}
