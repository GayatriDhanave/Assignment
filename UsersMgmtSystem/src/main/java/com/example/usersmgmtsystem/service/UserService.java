package com.example.usersmgmtsystem.service;

import com.example.usersmgmtsystem.entity.Users;

import java.util.List;

public interface UserService {
    boolean addUser(Users user) throws Exception;

    List<Users> getUser();
}
