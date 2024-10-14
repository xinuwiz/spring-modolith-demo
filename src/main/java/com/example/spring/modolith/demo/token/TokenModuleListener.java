package com.example.spring.modolith.demo.token;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class TokenModuleListener {

    @Autowired
    private TokenPublisher publisher;

    @EventListener
    public void handle(ContextRefreshedEvent event) {
        System.out.println("TokenModule is enabled");
    }
}