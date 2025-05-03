package com.example.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(path = "/hello")
    public String HelloWorld() {
        return "Hello World";
    }

    @GetMapping("/")
    public String Home()
        {
            return "Home";
        }
}
