package ru.netology.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"ru.netology"})
public class SpringBootDemoApplication {

    public static void main(String[] args) {
       SpringApplication.run(SpringBootDemoApplication.class, args);
    }

}
