package com.ronak.EmployeeManagementSystem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String test() {
        return "Simple Employee Management System Server Running";
    }
}