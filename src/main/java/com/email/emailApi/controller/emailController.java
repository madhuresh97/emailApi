package com.email.emailApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.email.emailApi.model.emailRequest;
import com.email.emailApi.service.emailService;

@RestController
public class emailController {

    @Autowired
    private emailService emailService;

    @RequestMapping("/welcome")
    public String welcome() {
        return "Greetings from Spring Boot!";
    }

    // API to send email
    @RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
    public ResponseEntity<?> sendEmail(@RequestBody emailRequest request) {

        System.out.println(request);
        return ResponseEntity.ok("Done!!");
    }
}
