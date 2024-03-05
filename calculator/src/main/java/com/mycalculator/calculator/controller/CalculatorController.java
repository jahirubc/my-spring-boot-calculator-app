package com.mycalculator.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/home")
    public String hello(){
        return "Hello  World, I am learning spring boot. So awesome";
    }

    //Query Parameter
    //http://localhost:8090/greet-me?name=arfin
//    @GetMapping("/greet-me")
//    public String greetMe(@RequestParam("name") String name){
//        return "Hello " + name;
//    }

    //Path Variable
//    @GetMapping("/greet-me/{name}")
//    public String greetMeWithPath(@PathVariable("name") String name){
//        return "Hello " + name;
//    }

    //http://localhost:8090/sum?num1=10&num2=20
    @GetMapping("/sum")
    public int sum(@RequestParam("num1") int n1, @RequestParam("num2") int n2){
        return n1 + n2;
    }

    @GetMapping("/sub")
    public int sub(@RequestParam("num1") int n1, @RequestParam("num2") int n2){
        return n1 - n2;
    }

    @GetMapping("/mul")
    public int mul(@RequestParam("num1") int n1, @RequestParam("num2") int n2){
        return n1 * n2;
    }

    @GetMapping("/div")
    public double div(@RequestParam("num1") int n1, @RequestParam("num2") int n2){
        return (double) n1 / n2;
    }
}
