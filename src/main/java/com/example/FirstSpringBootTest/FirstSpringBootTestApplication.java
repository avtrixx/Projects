package com.example.FirstSpringBootTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FirstSpringBootTestApplication {

    public static void main(String[] args) {


        SpringApplication.run(FirstSpringBootTestApplication.class, args);

   int i,j;
   i=j=3;
   int n = 2* ++i;
   int m= 2*j++;
        System.out.println(i + " "+ j +" "+ n+ " "+ m);
    }


}
