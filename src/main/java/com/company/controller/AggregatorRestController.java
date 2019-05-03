package com.company.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AggregatorRestController {

    @GetMapping("/")
    public String sayHello(){
        return "yo";
    }
}
