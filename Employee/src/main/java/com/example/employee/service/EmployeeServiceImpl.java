package com.example.employee.service;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.InputMismatchException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository eRepo;


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
}
