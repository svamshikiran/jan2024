package com.example.jan2024.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private static final Logger log = LoggerFactory.getLogger(CalculatorService.class);
    public double divide(double firstNumber, double secondNumber){
        log.info("THIS IS INSIDE THE SERVICE: First Number - {}, Second Number - {}", firstNumber, secondNumber);
        return firstNumber/secondNumber;
    }
}
