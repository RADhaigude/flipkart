package com.example.flipkart;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kart {

    @GetMapping ("/mykart")

    public String getData () {

        return "select product you want in kart";
    }
}
