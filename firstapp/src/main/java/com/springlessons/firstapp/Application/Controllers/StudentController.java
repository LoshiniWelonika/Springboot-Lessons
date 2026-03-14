package com.springlessons.firstapp.Application.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springlessons.firstapp.Domain.Entity.Student;
import com.springlessons.firstapp.External.Repository.StudentRepository;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {

    private final StudentRepository studentRepository;

    @GetMapping("/list")
    public Student getStudent(){
        Optional<Student> student = studentRepository.findByName("Amal Jayasiri");
        if (student.isPresent()){
            return student.get();
        }
        else{
            return new Student();
        }
    }

    @PostMapping("/add")
    public String postStudent(){
        return "Student Added";
    }
}
