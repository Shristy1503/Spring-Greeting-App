package com.example.greetingApp.service;

import com.example.greetingApp.entity.GreetingEntity;
import com.example.greetingApp.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceGreet {
    private String message;
    private final GreetingRepository greetingRepository;

    public ServiceGreet(GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }
    public String getServiceGreet(String firstName, String lastName){
        if(firstName!= null && lastName != null){
            return "Hello " + firstName + " " + lastName;
        }
        if(firstName!=null){
            return "Hello "+ firstName;
        }
        if(lastName!=null){
            return "Hello "+ lastName;
        }
        return "Hello World";
    }

    //method to save greetings
    public GreetingEntity saveGreetingRepository(String firstname, String lastName){
        //Generate message
        String message =getServiceGreet(firstname , lastName);
        //Make and store the message
        GreetingEntity entity = new GreetingEntity(firstname , lastName , message);
        return greetingRepository.save(entity);
    }

    //method to get all the greetings
    public List<GreetingEntity> getAllGreetings() {
        return greetingRepository.findAll();
    }
}
