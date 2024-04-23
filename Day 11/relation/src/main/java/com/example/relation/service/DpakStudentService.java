package com.example.relation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.model.DpakStudent;
import com.example.relation.repository.StudentRepository;

@Service
public class DpakStudentService {
    public StudentRepository studentRepository;
    public DpakStudentService(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public DpakStudent saveStudent(DpakStudent student)
    {
        return studentRepository.save(student);
    }
    public List<DpakStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
