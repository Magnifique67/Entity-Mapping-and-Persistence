package com.lab5.Entity.Mapping.and.Persistence.service;

import com.lab5.Entity.Mapping.and.Persistence.model.EmployeeModel;
import com.lab5.Entity.Mapping.and.Persistence.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Create  an Employee
    public EmployeeModel saveEmployee(EmployeeModel employee) {
        return employeeRepository.save(employee);
    }

    // Retrieve an Employee by ID
    public Optional<EmployeeModel> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    // Retrieve all Employees
    public List<EmployeeModel> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Delete an Employee by ID
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
    public EmployeeModel updateEmployee(EmployeeModel employee) {
        return employeeRepository.save(employee);
    }
}
