package com.rafaeldvl.springproject.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {


    @GetMapping("/somar")
    public double somar(@RequestParam int id, int id2){
        return (id + id2);
    }


    @GetMapping("/subtrair")
    public double subtrair(@RequestParam int id, int id2){
        return (id - id2);
    }


}
