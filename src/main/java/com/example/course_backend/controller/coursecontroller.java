package com.example.course_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class coursecontroller {

    @PostMapping("/")
    public  String Homepage(){
        return "welcome";
    }

    @PostMapping("/add")
    public  String CourseAdd(){
        return "course added";
    }

    @PostMapping("/viewall")
    public String ViewAll(){
        return "viewingall";
    }

}
