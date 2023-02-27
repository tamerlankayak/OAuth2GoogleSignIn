package com.example.oauthgooglesignin;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//sign in with google auth and get some responses from api
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hellWorld(Authentication authentication) {
        System.out.println(authentication);
        System.out.println(authentication.getPrincipal());
        return "Hello World";
    }

}
