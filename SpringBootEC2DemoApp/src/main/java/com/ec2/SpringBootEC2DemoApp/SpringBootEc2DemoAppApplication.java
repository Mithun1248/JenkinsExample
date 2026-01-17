package com.ec2.SpringBootEC2DemoApp;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class SpringBootEc2DemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEc2DemoAppApplication.class, args);
	}

    @PostConstruct
    public void startupLog() {
        System.out.println("APP STARTED VIA JENKINS AT " + LocalDateTime.now());
    }


}
