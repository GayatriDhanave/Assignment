package com.example.employee.service;

import com.example.employee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {

    Employee addEmployee(Employee emp);
    Employee getEmployee(int id);
    List<Employee> getAllEmployees();
    List<Employee> getEmployeeSalaryabovelimit();
    int getCount();

}
