package com.ronak.EmployeeManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronak.EmployeeManagementSystem.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}