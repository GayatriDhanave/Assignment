package com.example.usersmgmtsystem.repository;

import com.example.usersmgmtsystem.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Integer> {
}
