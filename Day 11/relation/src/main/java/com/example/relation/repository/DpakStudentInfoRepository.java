package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.DpakStudent;

@Repository
public interface DpakStudentInfoRepository extends JpaRepository<DpakStudentInfo,Integer>{
    
}