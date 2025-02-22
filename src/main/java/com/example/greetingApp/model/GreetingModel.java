package com.example.greetingApp.model;

public class GreetingModel {
    private String message;
    public GreetingModel(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }
}
