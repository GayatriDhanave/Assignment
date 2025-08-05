package com.example.usersmgmtsystem.service;

import com.example.usersmgmtsystem.entity.Users;
import com.example.usersmgmtsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    Pattern emailPattern = Pattern.compile("^[a-zA-Z]\\w*$");

    @Override
    public Users addUser(Users user) {
        try{

            Pattern
            String email=user.getEmailid();
            Matcher matcher = emailPattern.matcher(email);
            userRepository.save(user);
            return user;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
