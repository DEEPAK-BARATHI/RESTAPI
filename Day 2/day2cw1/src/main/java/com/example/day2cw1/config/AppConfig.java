package com.example.day2cw1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
@Configuration
public class AppConfig {
    @Value("InstaGram")
    public String appName;
    @Value("1.2.1")
    public String appVersion;

}
