package com.example.employee.controller;

import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee emp){
    Employee emp1 =employeeService.addEmployee(emp);
    if(emp1!=null){return "success";}
        return "failure";
    }

    @GetMapping("/viewEmployee/{id}")
    public Employee viewEmployee(@RequestParam int id){
        Employee emp1 =employeeService.getEmployee(id);
        if(emp1!=null){return emp1;}
        return null;
    }
}
