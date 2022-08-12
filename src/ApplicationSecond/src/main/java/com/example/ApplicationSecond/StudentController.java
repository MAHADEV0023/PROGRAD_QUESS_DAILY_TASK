package com.example.ApplicationSecond;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app2")
@RestController
public class StudentController {
    @PostMapping("/student/save")
    public Students save(Students student){
        student.setFirstName("RAM");
        student.setLastName("...");
        return student;
    }
}
