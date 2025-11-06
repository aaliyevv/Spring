package com.example.firstrestapiapplication.controller;

import com.example.firstrestapiapplication.model.AppUser;
import com.example.firstrestapiapplication.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appUser")
@RequiredArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<AppUser> createUser(@RequestBody AppUser user) {
        AppUser userBody = userService.create(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userBody);

    }
}


