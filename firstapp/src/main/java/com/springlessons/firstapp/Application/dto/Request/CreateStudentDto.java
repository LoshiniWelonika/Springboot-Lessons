package com.springlessons.firstapp.Application.dto.Request;

import lombok.Data;

@Data 
public class CreateStudentDto {
    private String name; 
    private String address; 
    private Integer grade;  
}
