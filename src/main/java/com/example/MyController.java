package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/api")
public class MyController {

    @GetMapping("/status")
    public String getStatus() {
        return "App v2 is running!";
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to the Java App v2!";
    }
}
