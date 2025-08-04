package com.example.employee.service;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository eRepo;

    static List<Employee> empList=new ArrayList<>();


    @Override
    public Employee addEmployee(Employee emp) {
        try {
           eRepo.save(emp);
           return emp;
        }catch (InputMismatchException e){
            throw new InputMismatchException();


        }
    }

    @Override
    public Employee getEmployee(int id) {
        return (Employee) eRepo.findById(id).get();
    }

    @Override
    public List<Employee> getAllEmployees() {
      List<Employee> employeeList=eRepo.findAll();
      return employeeList;
    }

    @Override
    public List<Employee> getEmployeeSalaryabovelimit() {
        List<Employee> employeeList=eRepo.findAll();
        long limit=25000;
        for( Employee emp:employeeList){
            if(emp.getSalary()>limit){
                empList.add(emp);
            }
        }
        return empList;
    }
}
