package com.example.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {
//    @Id
//            @GeneratedValue(strategy = GenerationType.IDENTITY)

    private final int eid;
    private String name;
    private short age;
    private char gender;
    private String address;
    private long salary;
    private float bonus;
    private byte availableLeaves;


}
