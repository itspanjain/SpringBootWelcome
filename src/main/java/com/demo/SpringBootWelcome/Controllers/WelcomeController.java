package com.demo.SpringBootWelcome.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/")
    public String greeting(){
        return "Greetings from SpringBootWelcome Application!!!";
    }
    @RequestMapping("/welcome")
    public String welcome(){
        return "Welcome User!!!";
    }
}