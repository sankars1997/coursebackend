package com.example.course_backend.controller;

import com.example.course_backend.model.CourseAdd;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class coursecontroller {

    @PostMapping("/")
    public  String Homepage(){
        return "welcome";
    }

    @PostMapping(path="/courseadd",consumes = "application/json",produces = "application/json")
    public  String CourseAdd(@RequestBody CourseAdd c){
        System.out.println(c.getTitle());
        System.out.println(c.getDescription());
        System.out.println(c.getVenue());
        System.out.println(c.getDuration());
        System.out.println(c.getDate());
        return "course added";
    }

    @PostMapping("/viewall")
    public String ViewAll(){
        return "viewingall";
    }

}
