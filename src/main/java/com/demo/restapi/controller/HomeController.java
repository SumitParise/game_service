package com.demo.restapi.controller;


import com.demo.restapi.beans.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @GetMapping("/home")
    public ResponseEntity<List<Product> > hello(Model model){
        Product p = new Product();
        Product p1 = new Product();
        p.setId(1);
        p.setPname("Laptop");
        p.setPrice(50000);

        p1.setId(2);
        p1.setPname("Mobile");
        p1.setPrice(20000);

        List<Product> list = List.of(p,p1);

        return ResponseEntity.ok(list);



    }
}
