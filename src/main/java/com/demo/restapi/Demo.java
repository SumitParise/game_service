package com.demo.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {


    @GetMapping("/demo1")
    public  String getSome(){
        return "hello";
    }
}
