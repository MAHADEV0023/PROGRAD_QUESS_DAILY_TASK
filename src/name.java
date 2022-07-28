package com.PrintingNAme.NamePrinting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class name {
    @GetMapping("/name")
    public String print()
    {
        return "NAME:MAHADEV";
    }

}
