package com.example.test.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitdemoApplication.class, args);
        System.out.println("change 1");
        System.out.println("change 2");
    }

}
