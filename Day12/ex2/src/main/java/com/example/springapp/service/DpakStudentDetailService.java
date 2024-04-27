package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.DpakStudentDetail;
import com.example.springapp.repository.DpakStudentDetailRepository;
import com.example.springapp.repository.DpakStudentRepository;

@Service
public class DpakStudentDetailService {
    @Autowired
    DpakStudentDetailRepository studentDetailRepository;
    @Autowired
    DpakStudentRepository studentRepository;
    public DpakStudentDetail addStudentDetail(int id,DpakStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}
