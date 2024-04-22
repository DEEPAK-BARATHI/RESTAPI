package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.Course;
import java.util.List;


@Repository
public interface DpakCourseRepo extends JpaRepository<Course,Integer>{

    List<Course> findByCourseName(String courseName);
    
}
