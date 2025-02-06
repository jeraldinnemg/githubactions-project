package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/status")
    public String getStatus() {
        return "App is running!";
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to the Java App!";
    }
}
