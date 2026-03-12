package com.springlessons.firstapp.Application.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/list")
    public String getStudent(){
        return "Student List";
    }

    @PostMapping("/add")
    public String postStudent(){
        return "Student Added";
    }
}
