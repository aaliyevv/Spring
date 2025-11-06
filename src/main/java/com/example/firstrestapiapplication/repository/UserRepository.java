package com.example.firstrestapiapplication.repository;

import com.example.firstrestapiapplication.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {
    // Example: AppUser findByEmail(String email); //select all from AddUsers if email equals
}
