package com.ronak.EmployeeManagementSystem.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ronak.EmployeeManagementSystem.Entity.Employee;
import com.ronak.EmployeeManagementSystem.Repository.EmployeeRepo;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    // Add employee
    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    // Get employee by id
    public Employee getEmployeeById(int id) {
        return employeeRepo.findById(id).orElse(null);
    }

    // Update employee
    public void updateEmployee(int id, Employee employee) {
        employee.setId(id); 
        employeeRepo.save(employee);
    }

    // Delete employee
    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }
}