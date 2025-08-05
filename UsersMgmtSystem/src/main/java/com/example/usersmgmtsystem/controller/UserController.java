package com.example.usersmgmtsystem.controller;

import com.example.usersmgmtsystem.entity.Users;
import com.example.usersmgmtsystem.service.UserService;
import com.example.usersmgmtsystem.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService ;

    @PostMapping("/addUser")
    public ResponseEntity<Users> getUser(@RequestBody Users user){
        Users u= userService.addUser(user);
        return null;
    }
}
