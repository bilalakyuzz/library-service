package com.example.userservice.service.concretes;

import com.example.userservice.entities.User;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.service.abstracts.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;


    @Override
    public User findById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);

    }

    @Override
    public void update(User user) {
        userRepository.save(user);

    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);

    }






}
