package com.example.cw1.service;

import com.example.cw1.model.DpakPayroll;
import com.example.cw1.repository.DpakPayrollRepo;
import org.springframework.stereotype.Service;

@Service
public class DpakPayrollService {
    private final DpakPayrollRepo payrollRepo;

    public DpakPayrollService(DpakPayrollRepo payrollRepo) {
        this.payrollRepo = payrollRepo;
    }

    public DpakPayroll createPayroll(DpakPayroll payroll) {
        return payrollRepo.save(payroll);
    }

    public DpakPayroll getPayrollByEmployeeId(Long employeeId) {
        return payrollRepo.findById(employeeId).orElse(null);
    }
}
