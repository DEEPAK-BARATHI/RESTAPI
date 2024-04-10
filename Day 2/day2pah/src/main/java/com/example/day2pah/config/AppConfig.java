package com.example.day2pah.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${Name}")
    private String studentName;
    @Value("${Department}")
    private String studentDepartment;
    public AppConfig() {
    }
    public AppConfig(String studentName, String studentDepartment) {
        this.studentName = studentName;
        this.studentDepartment = studentDepartment;
    }
    

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentDepartment() {
        return studentDepartment;
    }
    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }
    
}
