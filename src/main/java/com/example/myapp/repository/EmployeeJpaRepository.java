package com.example.myapp.repository;

import com.example.myapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeJpaRepository extends JpaRepository<Employee, Integer> {
}
