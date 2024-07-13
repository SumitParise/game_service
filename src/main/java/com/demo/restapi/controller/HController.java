package com.demo.restapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HController {


    @GetMapping("/demo")
    public String get(){

        return "hello";
    }
}
