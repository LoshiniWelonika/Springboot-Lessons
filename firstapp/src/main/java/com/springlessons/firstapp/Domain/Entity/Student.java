package com.springlessons.firstapp.Domain.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student { 
    @Id
    private Integer id;
    private String name;
    private String address;
}