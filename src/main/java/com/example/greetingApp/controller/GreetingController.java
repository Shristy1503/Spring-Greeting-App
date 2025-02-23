package com.example.greetingApp.controller;

import com.example.greetingApp.entity.GreetingEntity;
import com.example.greetingApp.model.GreetingModel;
import com.example.greetingApp.service.ServiceGreet;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

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
   //user first name and last name
   @GetMapping("/hello")
   public GreetingModel sayHello(@RequestParam (required = false) String firstName, @RequestParam(required = false)String lastName) {
       String message = greetings.getServiceGreet(firstName, lastName);
       return  new GreetingModel(message);
   }

   //save methods in repository
    @PutMapping("/save")
    public GreetingEntity saveGreetings(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName){
        return greetings.saveGreetingRepository(firstName,lastName);
    }

    @GetMapping("/all")
    public List<GreetingEntity> getAllGreetings(){
        return greetings.getAllGreetings();
    }

    //find a Greeting by id
    @GetMapping("/find/{id}")
    public Optional<GreetingEntity> getGreetingWithId(@PathVariable Long id){
       return greetings.getGreetingById(id);
    }
}
