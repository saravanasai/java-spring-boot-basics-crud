package com.zerocode.firstspringapp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControlller {

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String index(){
        return "Hello Spring Boot";
    }
}
