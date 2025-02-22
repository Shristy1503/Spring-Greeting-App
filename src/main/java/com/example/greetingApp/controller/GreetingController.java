package com.example.greetingApp.controller;

import com.example.greetingApp.model.GreetingModel;
import com.example.greetingApp.model.ServiceGreet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingController {
   // private ServiceGreet greet;
    @GetMapping
    public GreetingModel getGreeting(){
        return new GreetingModel("Hello : this is get mapping");
    }
    @PutMapping
    public GreetingModel putGreeting(){
        return new GreetingModel("Hello : this is put mapping");
    }

    @DeleteMapping
    public GreetingModel deleteGreeting(){
        return new GreetingModel("Hello : this is delete mapping");
    }

    @PostMapping
    public GreetingModel postGreeting(){
        return new GreetingModel("Hello : this is post mapping");
    }

    //using service layer

    private  ServiceGreet greetings;
   public  GreetingController(ServiceGreet greetings){
       this.greetings = greetings;
   }

}
