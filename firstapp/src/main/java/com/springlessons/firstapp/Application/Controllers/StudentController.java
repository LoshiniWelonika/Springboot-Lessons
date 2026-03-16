package com.springlessons.firstapp.Application.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springlessons.firstapp.Application.dto.Request.CreateStudentDto;
import com.springlessons.firstapp.Application.dto.Response.StudentGeneralDto;
import com.springlessons.firstapp.Domain.Entity.Student;
import com.springlessons.firstapp.Domain.Service.StudentService;
import com.springlessons.firstapp.External.Repository.StudentRepository;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {

    private StudentService studentService;

    @GetMapping("/getStudent")
    public ResponseEntity<StudentGeneralDto> getStudent(@RequestParam Integer id){
        return studentService.getStudent(id);
    }

    @PostMapping("/addstudent")
    public ResponseEntity<Student> addstudent(@RequestBody CreateStudentDto createStudentDto){
        return studentService.addStudent(createStudentDto);
    }

    @DeleteMapping("/deletestudent")
    public ResponseEntity<String> deleteStudent(@RequestParam Integer id){
        return studentService.deleteStudent(id);
    }

    @PutMapping("/updatestudent")
    public ResponseEntity<String> updateStudent(@RequestParam  Integer id, @RequestParam String newName ){
        return studentService.updateStudent(id, newName);
    }
}
