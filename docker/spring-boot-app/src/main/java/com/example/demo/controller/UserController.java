package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/")
    public Map<String, Object> home() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hello from Spring Boot Docker!");
        response.put("timestamp", System.currentTimeMillis());
        return response;
    }

    @GetMapping("/users")
    public List<Map<String, Object>> getUsers() {
        return Arrays.asList(
            Map.of("id", 1, "name", "John Doe", "email", "john@example.com"),
            Map.of("id", 2, "name", "Jane Smith", "email", "jane@example.com")
        );
    }
}