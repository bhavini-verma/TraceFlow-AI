package com.fitness.userservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{userId}")
    public ResponseEntity<String> getUserProfile(@PathVariable String userId) {
        return ResponseEntity.ok("User profile for: " + userId);
    }
    
    @PostMapping("/register")
    public ResponseEntity<String> registerUser() {
        return ResponseEntity.ok("User registration placeholder");
    }
}
