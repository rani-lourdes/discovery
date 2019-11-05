package com.example.message.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping(value = "/getMessage")
    public ResponseEntity<String> message() {
        String hostname = "Message from host";
        return new ResponseEntity<>(hostname, HttpStatus.OK);
    }

    /*private String getHostname() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "Hostname not available";
        }
    }*/
}
