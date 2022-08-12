package com.example.ApplicationOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app1")
@RestController
public class StudentController {
    @Autowired
RestClientServer restClientServer;
    @GetMapping("/student/send")
    public Students save(){
        Students student =new Students();
        student.setFirstName("mahadev");
        student.setLastName("...");
        return restClientServer.save(student);

    }
}
