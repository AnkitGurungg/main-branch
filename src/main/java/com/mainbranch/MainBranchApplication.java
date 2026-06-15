package com.mainbranch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainBranchApplication {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SpringApplication.run(MainBranchApplication.class, args);
        System.out.println("Bye, World!");
        System.out.println("Welcome Back!");
    }

}
