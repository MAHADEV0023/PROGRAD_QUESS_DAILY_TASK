package com.secondmicroservice.Microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class maximumMinimumController {
    @Autowired
    private MaximiumMinimumConfiguration maximiumminimumconfiguration;
    @GetMapping("/numbers")

    public MaximiumMinimumConfiguration number()
    {

        return new  MaximiumMinimumConfiguration(maximiumminimumconfiguration.getMaximum(),maximiumminimumconfiguration.getMinimum());
    }

}
