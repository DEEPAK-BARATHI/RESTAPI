package com.example.cw1.repository;
import com.example.cw1.model.DpakEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DpakEmployeeRepo extends JpaRepository<DpakEmployee, Long> {
}
