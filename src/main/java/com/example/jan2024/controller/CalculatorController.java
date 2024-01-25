package com.example.jan2024.controller;

import com.example.jan2024.services.CalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    @Autowired // Dependency Injection
    CalculatorService calculatorService;

    private static final Logger log = LoggerFactory.getLogger(CalculatorController.class);

    @GetMapping("/divide/{firstInput}/{secondInput}")
    public ResponseEntity<Object> divide(@PathVariable("firstInput") double first,
                         @PathVariable("secondInput") double second){
        log.info("THIS IS INSIDE THE CONTROLLER: First Input - {}, Second Input - {}", first, second);
        if(second == 0){
            return new ResponseEntity<>("WRONG INPUT PROVIDED, PLEASE CHECK", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(calculatorService.divide(first, second), HttpStatus.OK);
    }
}
// include add, subtract, multiply and reminder/modulus operations
// API for calculating the Area of a Cirle
// API for calculating the Simple Interest = PTR/100
