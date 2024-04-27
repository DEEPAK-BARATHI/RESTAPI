package com.example.ce1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.model.DpakEmployee;
import com.example.ce1.service.DpakEmployeeService;

@RestController
public class DpakEmployeeController {
    @Autowired
    DpakEmployeeService employeeService;

    @PostMapping("/employee")
    public DpakEmployee setMethod(@RequestBody DpakEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<DpakEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<DpakEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
