package com.loya.springjpaoracledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
@EnableJpaAuditing
public class SpringJpaOracleDemoApplication {

    public static void main(String[] args) {
        run(SpringJpaOracleDemoApplication.class, args);
    }
}
