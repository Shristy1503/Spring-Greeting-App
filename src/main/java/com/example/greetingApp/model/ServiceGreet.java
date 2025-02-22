package com.example.greetingApp.model;

import org.springframework.stereotype.Service;

@Service
public class ServiceGreet {
    private String message;
    public String getServiceGreet(){
        return "Hello World";
    }
}
