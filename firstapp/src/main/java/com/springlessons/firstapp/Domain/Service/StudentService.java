package com.springlessons.firstapp.Domain.Service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springlessons.firstapp.Application.dto.Response.StudentGeneralDto;
import com.springlessons.firstapp.Domain.Entity.Student;
import com.springlessons.firstapp.External.Repository.StudentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public ResponseEntity<StudentGeneralDto> getStudent(Integer id) {
        StudentGeneralDto studentGeneralDto = new StudentGeneralDto();

        Optional<Student> optionalStudent = studentRepository.findById(id);

        if (optionalStudent.isPresent()){
            Student student = optionalStudent.get();
            studentGeneralDto.setId(student.getId());
            studentGeneralDto.setName(student.getName());
            studentGeneralDto.setGrade(student.getGrade());
            return ResponseEntity.ok(studentGeneralDto);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}
