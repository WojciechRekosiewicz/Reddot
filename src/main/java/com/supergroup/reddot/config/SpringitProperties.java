package com.supergroup.reddot.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("springit")
public class SpringitProperties {

    private String welcomeMsg = "Hi Guys!";


}
