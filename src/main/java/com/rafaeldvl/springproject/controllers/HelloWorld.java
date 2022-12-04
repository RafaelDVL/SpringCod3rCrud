package com.rafaeldvl.springproject.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/ola")
    public String hello(){
        return "Hello World!!!";
    }
}
