package com.uc.springlearning.hellocontroller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello () {
        return "Hello from BridgeLabz";
    }
}