package com.example.flipkart;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flip {

    @GetMapping ("/myflip")
    public String getData() {
        return "purchase new products from flipkart";
    }
}
