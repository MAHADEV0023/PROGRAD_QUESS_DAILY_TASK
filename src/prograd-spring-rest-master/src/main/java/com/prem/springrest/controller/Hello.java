package com.prem.springrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/home")
    public String root(){
        return "MAHADEV";
    }


}
