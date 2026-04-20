
package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

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

    public String login2(@RequestBody String body) {
        
        return "TODO OAuth2";
    }
}
