package com.example.spring.modolith.demo.main;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MainModuleListener {

    @Async
    @EventListener
    public void handle(ContextRefreshedEvent event) {
        System.out.println("MainModule is enabled.");
    }

}