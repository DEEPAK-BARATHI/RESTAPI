package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.DpakStudent;
import com.example.relation.service.DpakStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class StudentController {
    public DpakStudentService studentService;
    public StudentController(DpakStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public DpakStudent postMethodName(@RequestBody DpakStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<DpakStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
