package com.employeeproject.employeeprojectdemo.service;

import java.util.List;

import com.employeeproject.employeeprojectdemo.dto.EmployeeDTO;

public interface EmployeeService {
    String createEmployee(EmployeeDTO employee);
    List<EmployeeDTO> readEmployee();
    boolean deleteEmployee(Long id);
    String updateEmployee(Long id , EmployeeDTO employee);
    EmployeeDTO readEmploye(Long id);
}
