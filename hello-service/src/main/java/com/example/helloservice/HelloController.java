package com.example.helloservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
final class HelloController {

    private final int port;

    public HelloController(@Value("${server.port}") final int port) {
        this.port = port;
    }

    @GetMapping("/")
    String sayHello() {
        return "Hello from hello-service running on port: " + port;
    }
}
