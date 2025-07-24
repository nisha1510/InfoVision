package com.auth.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.service.dto.LoginRequest;
import com.auth.service.dto.RegisterRequest;
import com.auth.service.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired private AuthService service;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request) {
        String token = service.register(request);
        return ResponseEntity.ok("Registered successfully. Token: JWT Token " + token);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        String token = service.login(request);
        return ResponseEntity.ok("Login successful. Token: " + token);
    }
}
