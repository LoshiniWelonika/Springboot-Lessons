package com.springlessons.firstapp.Domain.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
        @ExceptionHandler(StudentNotFound.class)
        public ResponseEntity<String> handleStudentNotFoundExcepton(StudentNotFound studentnotfoundexception){
            log.error("Student not found exception occured");
            ResponseEntity<String> responseEntity = new ResponseEntity<>(studentnotfoundexception.getMessage(), 
            HttpStatus.NOT_FOUND);
            return responseEntity;
        }
} 
