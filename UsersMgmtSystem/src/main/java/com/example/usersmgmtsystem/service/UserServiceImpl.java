package com.example.usersmgmtsystem.service;

import com.example.usersmgmtsystem.entity.Users;
import com.example.usersmgmtsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9._+-]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$");
    Pattern passwordPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%_])[a-zA-Z0-9@#$%_]{8,}$");

    @Override
    public boolean addUser(Users user) throws Exception {
        try {
//
            String email = user.getEmailid();
            String password = user.getPassword();
            Matcher matcher = emailPattern.matcher(email);
            Matcher matcher2 = passwordPattern.matcher(password);
            if (matcher.matches() && matcher2.matches()) {
                userRepository.save(user);
                return true;
            }

        } catch (Exception e) {
            throw new Exception("Please retype email and password");

        }
        return false;


    }

    @Override
    public List<Users> getUser() {
        List<Users> list=new ArrayList<Users>();
        for (Users users : userRepository.findAll()) list.add(users);
        return list;
    }
}
