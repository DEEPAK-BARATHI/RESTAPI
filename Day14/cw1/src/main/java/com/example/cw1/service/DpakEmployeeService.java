package com.example.cw1.service;

import com.example.cw1.model.DpakEmployee;
import com.example.cw1.repository.DpakEmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DpakEmployeeService {
    private final DpakEmployeeRepo employeeRepo;

    public DpakEmployeeService(DpakEmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public DpakEmployee createEmployee(DpakEmployee employee) {
        return employeeRepo.save(employee);
    }

    public List<DpakEmployee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Optional<DpakEmployee> getEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }
}
