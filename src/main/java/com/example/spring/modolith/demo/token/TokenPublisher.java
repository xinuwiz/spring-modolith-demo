package com.example.spring.modolith.demo.token;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class TokenPublisher {

    private final ApplicationEventPublisher publisher;

    public TokenPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publish(String message) {
        final TokenContent content = new TokenContent(message);
        publisher.publishEvent(content);
    }
}