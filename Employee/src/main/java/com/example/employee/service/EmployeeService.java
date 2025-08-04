package com.example.employee.service;

import com.example.employee.entity.Employee;
import org.springframework.stereotype.Service;


public interface EmployeeService {

    Employee addEmployee(Employee emp);
    Employee getEmployee(int id);
}
