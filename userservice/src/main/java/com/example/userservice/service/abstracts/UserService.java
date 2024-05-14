package com.example.userservice.service.abstracts;

import com.example.userservice.entities.User;

import java.util.List;

public interface UserService {
    User findById(int id);
    List<User> findAll();
    void save(User user);
    void update(User user);
    void delete(int id);





}
