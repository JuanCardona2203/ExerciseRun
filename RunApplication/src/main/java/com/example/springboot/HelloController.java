package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Saludos desde el controlador de Spring Boot!";
    }

    @RequestMapping("/health")
    public String checkAPI(){
       return  "<h1>The API is working ok!</h1>";
   }
}
