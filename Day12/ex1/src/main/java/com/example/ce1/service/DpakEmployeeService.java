package com.example.ce1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.DpakEmployee;
import com.example.ce1.repository.DpakEmployeeRepo;

@Service
public class DpakEmployeeService {
    @Autowired
    DpakEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public DpakEmployee setEmployee(DpakEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<DpakEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<DpakEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
