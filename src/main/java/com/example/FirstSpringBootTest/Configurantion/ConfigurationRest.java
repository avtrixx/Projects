package com.example.FirstSpringBootTest.Configurantion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigurationRest {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
