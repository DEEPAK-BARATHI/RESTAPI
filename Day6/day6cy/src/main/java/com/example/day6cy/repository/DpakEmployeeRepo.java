package com.example.day6cy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day6cy.model.DpakEmployee;

public interface DpakEmployeeRepo extends JpaRepository<DpakEmployee,Integer>{
    
}
