package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.DpakStudent;
import com.example.springapp.repository.DpakStudentRepository;

@Service
public class DpakStudentService {
    @Autowired
    DpakStudentRepository studentRepository;
    public DpakStudent addStudents(DpakStudent student)
    {
        return studentRepository.save(student);
    }
    public List<DpakStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<DpakStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<DpakStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
