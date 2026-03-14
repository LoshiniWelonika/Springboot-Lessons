package com.springlessons.firstapp.External.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springlessons.firstapp.Domain.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
