package com.linkhipu.superdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String homePage() {
        return "Hello from "+appName;
    }
}
