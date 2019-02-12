package com.supergroup.reddot;

import com.supergroup.reddot.config.SpringitProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(SpringitProperties.class)
public class ReddotApplication {


    @Autowired
    private SpringitProperties springitProperties;

    public static void main(String[] args) {
        SpringApplication.run(ReddotApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(){
        return args -> {
          System.out.println("Welcome Message is " + springitProperties.getWelcomeMsg());
        };
    }

}

