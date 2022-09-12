package com.example.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycontroller {
    @GetMapping("/")
    public String greetingDisplay(){
        return "welcome";
    }
    @GetMapping("/getDate")
        public Date displayDate(){
            return new Date();
        }
    
    }


