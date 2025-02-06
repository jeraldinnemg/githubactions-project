package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // Base path: http://localhost:8080/api
public class MyController {

    @GetMapping("/status") // Accessible at: http://localhost:8080/api/status
    public String getStatus() {
        return "App is running!";
    }

    @GetMapping("/") // Accessible at: http://localhost:8080/
    public String home() {
        return "Welcome to the Java App!";
    }
}

