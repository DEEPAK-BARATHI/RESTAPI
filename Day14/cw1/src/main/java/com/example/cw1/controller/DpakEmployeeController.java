package com.example.cw1.controller;

import com.example.cw1.model.DpakEmployee;
import com.example.cw1.service.DpakEmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class DpakEmployeeController {
    private final DpakEmployeeService employeeService;

    public DpakEmployeeController(DpakEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<DpakEmployee> createEmployee(@RequestBody DpakEmployee employee) {
        DpakEmployee createdEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
    }

    @GetMapping
    public ResponseEntity<List<DpakEmployee>> getAllEmployees() {
        List<DpakEmployee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<DpakEmployee> getEmployeeById(@PathVariable Long employeeId) {
        Optional<DpakEmployee> employee = employeeService.getEmployeeById(employeeId);
        return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

