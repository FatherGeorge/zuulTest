package com.example.goodbyeservice;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
final class GoodbyeController {

    private final int port;

    public GoodbyeController(@Value("${server.port}") final int port) {
        this.port = port;
    }

    @GetMapping("/")
    String sayHello() {
        return "Hello from goodbye-service running on port: " + port;
    }
}

