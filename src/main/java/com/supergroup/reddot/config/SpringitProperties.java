package com.supergroup.reddot.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("springit")
public class SpringitProperties {

    /**
     * Welcome message this is(Master YOda)
     */

    private String welcomeMsg = "Hi Guys!";


}
