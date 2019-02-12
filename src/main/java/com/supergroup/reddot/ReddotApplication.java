package com.supergroup.reddot;

import com.supergroup.reddot.config.SpringitProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SpringitProperties.class)
public class ReddotApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReddotApplication.class, args);
    }

}

