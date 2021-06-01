package com.example.FirstSpringBootTest.Connector;

import org.springframework.stereotype.Component;

@Component
public class Sample {

    public String echo(){
        System.out.println("Hello");
        return "";
    }
}
