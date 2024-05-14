package com.example.userservice.controller;

import com.example.userservice.entities.User;
import com.example.userservice.service.abstracts.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.save(user);
    }
    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.findById(id);
    }
    @DeleteMapping("/deleteUserById/{id}")
    public void deleteUserById(@PathVariable int id) {
        userService.delete(id);
    }
    @PutMapping
    public void updateUser(@RequestBody User user) {
        userService.update(user);
    }




}
