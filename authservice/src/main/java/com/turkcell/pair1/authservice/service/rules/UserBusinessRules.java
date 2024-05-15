package com.turkcell.pair1.authservice.service.rules;
import com.turkcell.pair1.authservice.entity.User;
import com.turkcell.pair1.authservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserBusinessRules {
    private final UserRepository userRepository;

    public User getUserFromOptional(Optional<User> optionalUser) {
        return optionalUser.orElseThrow(() -> new RuntimeException("No user found"));
    }

    public void checkIfUserAlreadyExists(String username) {
        if (userRepository.existsByUsername(username)){
            throw new RuntimeException("user already exists");
        }
    }
}
