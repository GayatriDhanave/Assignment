package com.example.employee.controller;

import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Employee viewEmployee(@PathVariable int id){
        Employee emp1 =employeeService.getEmployee(id);
        if(emp1!=null){return emp1;}
        return null;
    }

    @GetMapping("/viewAllEmployee")
    public List<Employee> viewAllEmployee(){
        List<Employee> empList =employeeService.getAllEmployees();
        if(empList!=null){
            for(Employee emp:empList){ System.out.println(emp);}
            return empList;}
        return null;
    }

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees(){
        List<Employee> empList =employeeService.getEmployeeSalaryabovelimit();
        if(empList!=null){
            for(Employee emp:empList){ System.out.println(emp);}
            return empList;}
        return null;
    }

    @GetMapping("/getCountOfEmployees")
    public int getCountOfEmployees(){
        int count=employeeService.getCount();
        return count;
    }
}
