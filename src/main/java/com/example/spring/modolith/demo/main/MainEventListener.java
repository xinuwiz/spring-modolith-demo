package com.example.spring.modolith.demo.main;

import com.example.spring.modolith.demo.token.TokenContent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MainEventListener {

    @EventListener
    public void listen(TokenContent content) {
        final String token = content.content();
        System.out.println(token);
    }
}
