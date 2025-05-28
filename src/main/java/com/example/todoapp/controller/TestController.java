package com.example.todoapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<?> test(Authentication auth) {
        return ResponseEntity.ok("Hello, " + auth.getName());
    }
}
