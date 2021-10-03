package com.p4b.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("ping")
    public String ping() {
        return "pong";
    }
}
