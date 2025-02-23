package com.example.greetingApp.repository;

import com.example.greetingApp.entity.GreetingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
//To add all the greetings
public interface GreetingRepository extends JpaRepository<GreetingEntity, Long> {
}
