package com.example.day5cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw2.model.DpakEmployee;


@Repository
public interface DpakEmployeeRepo extends JpaRepository<DpakEmployee,Integer>{
    
}
