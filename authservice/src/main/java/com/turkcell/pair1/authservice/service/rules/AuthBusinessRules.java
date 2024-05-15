package com.turkcell.pair1.authservice.service.rules;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthBusinessRules {



    public void isAuthenticated(Authentication authentication) {
        if (!authentication.isAuthenticated()) {
            throw new RuntimeException("Wrong username or password");
        }
    }
}
