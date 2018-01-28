package com.example.myapp.controller;


import com.example.myapp.model.Employee;
import com.example.myapp.repository.EmployeeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeJpaRepository employeeJpaRepository;

    @GetMapping(value = "/getAllEmployees")
    public List<Employee> getAllEmployee() {
        return employeeJpaRepository.findAll();
    }

    @PostMapping(value = "/createEmployee")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeJpaRepository.save(employee);
    }
}
