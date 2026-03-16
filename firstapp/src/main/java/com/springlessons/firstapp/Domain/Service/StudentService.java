package com.springlessons.firstapp.Domain.Service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springlessons.firstapp.Application.dto.Request.CreateStudentDto;
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

    public ResponseEntity<Student> addStudent(CreateStudentDto createStudentDto) {
        Student student = new Student();
        student.setName(createStudentDto.getName());
        student.setAddress(createStudentDto.getAddress());
        student.setGrade(createStudentDto.getGrade());
        studentRepository.save(student);

        return ResponseEntity.ok(student); 
    }

    public ResponseEntity<String> deleteStudent(Integer id){
        Optional<Student> optstudent = studentRepository.findById(id);

        if(optstudent.isPresent()){
            studentRepository.deleteById(id);
            return ResponseEntity.ok("Student deleted successfully");
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<String> updateStudent(Integer id, String newName) {
        Optional<Student> optionalstudent = studentRepository.findById(id);
        if(optionalstudent.isPresent()){
            Student student = optionalstudent.get();
            student.setName(newName);
            studentRepository.save(student);
            return ResponseEntity.ok("Student updated successfully");
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }


}
