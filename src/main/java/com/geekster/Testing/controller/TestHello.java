package com.geekster.Testing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHello {

    @GetMapping("/home1")
    public String home1(){
        return "nikal be";
    }
    @GetMapping("/home2")
    public String home2(){
        return "to kaise h aaplog";
    }
    @GetMapping("/home3")
    public String home3(){
        return "nikal lawde";
    }
}
