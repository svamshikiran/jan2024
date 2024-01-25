package com.example.jan2024.controller;


import com.example.jan2024.model.Message;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/greet")
    public String sayHello(){
        return "WELCOME TO SPRINGBOOT FRAMEWORK";
    }

    //http://localhost:2024/jan2024/hello/greet/VAMSHI
    @GetMapping("/greet/{name}")
    public String sayHello(@PathVariable("name") String input){
        return "HI "+input+", WELCOME TO SPRINGBOOT FRAMEWORK";
    }

    //http://localhost:2024/jan2024/hello/greetwithparams?name=VAMSHI
    @GetMapping("/greetwithparams")
    public String sayHelloWithParams(@RequestParam("name") String input){
        return "HI "+input+", WELCOME TO SPRINGBOOT FRAMEWORK - USING REQUEST PARAMS";
    }

    @PostMapping("/post")
    public String postMessage(@RequestBody Message message){
        return message.toString();
    }
}

// IOC - Inversion Of Control - @RestController, @Service, @Component, @Controller, @Bean, @Repository
