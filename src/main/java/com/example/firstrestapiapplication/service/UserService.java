package com.example.firstrestapiapplication.service;

import com.example.firstrestapiapplication.model.AppUser;
import com.example.firstrestapiapplication.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository; //injection of repository

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public AppUser create(AppUser user) {
        return userRepository.save(user);
    }
}
