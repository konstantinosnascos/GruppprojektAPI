
package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody String body) {

        // TODO:
        // 1. Ta emot username + password
        // 2. Autentisera via Spring
        // 3. Generera JWT
        // 4. Returnera token

        return "TODO JWT";


    }
}
