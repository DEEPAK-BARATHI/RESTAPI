package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Course;
import com.example.springapp.repository.CourseRepo;

@Service
public class DpakCourseService {
    @Autowired
    private CourseRepo rep;

    public boolean post(Course person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Course> getAll()
    {
        return rep.findAll();
    }

    public List<Course> getbyAge(String courseName)
    {
        return rep.findByCourseName(courseName);
    }
    
}
