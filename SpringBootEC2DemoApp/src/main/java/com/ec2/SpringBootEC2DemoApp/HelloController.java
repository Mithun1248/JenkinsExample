package com.ec2.SpringBootEC2DemoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Jenkins deployed app";
    }

    @GetMapping("/hello_mother_india")
    public String helloMotherIndia() {
        return "Hello from Mother India deployed app";
    }

    @GetMapping
}

