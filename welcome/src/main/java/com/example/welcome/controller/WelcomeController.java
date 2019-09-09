package com.example.welcome.controller;

import com.example.welcome.feign.MessageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Autowired
    private MessageClient messageClient;

    @GetMapping(value = "/welcome")
    public ResponseEntity<String> welcome() {
        String message = messageClient.getMessage();
        String finalMessage = "Hello world from " + message;
        return new ResponseEntity<>(finalMessage, HttpStatus.OK);
    }
}
