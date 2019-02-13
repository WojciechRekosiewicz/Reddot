package com.supergroup.reddot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReddotApplication {

    private static final Logger log = LoggerFactory.getLogger(ReddotApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ReddotApplication.class, args);
    }
}

