package com.advance.springboot.kafka.tutorial;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Spring Boot Kafka Project", version = "2.0", description = "Spring Boot Kafka Tutorial Demo Project"))
public class SpringBootKafkaTutorialApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootKafkaTutorialApplication.class, args);
        System.out.println("Running Application Spring Boot Kafka Tutorial Demo Project!");
    }
}