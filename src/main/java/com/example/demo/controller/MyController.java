package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MyController")
public class MyController {

    @RequestMapping("/start")
    public void initialMethod(){
        System.out.println("HI STARTED NEW SPRING BOOT WITH GRADLE");
    }
}
