package com.example.usersmgmtsystem.controller;

import com.example.usersmgmtsystem.entity.Users;
import com.example.usersmgmtsystem.service.UserService;
import com.example.usersmgmtsystem.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService ;

    @PostMapping("/addUsers")
    public String getUser(@RequestBody Users user){
        try {
            boolean b= userService.addUser(user);
            if(b){return "success";}

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "failed";
    }

    @GetMapping("/getUsers")
    public List<Users> getUsers(){
        List<Users> userList= userService.getUser();
        if(userList.size()>0){
            return userList;
        }
        return null;
    }
}
