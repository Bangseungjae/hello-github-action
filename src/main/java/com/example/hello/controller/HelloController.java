package com.example.hello.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.of(Optional.of("Hello, Github Actions 두번 쨰"));
    }

    @GetMapping("")
    public ResponseEntity<String> home() {
        return ResponseEntity.of(Optional.of("Hello, Github Actions 세번 쨰"));
    }
}

