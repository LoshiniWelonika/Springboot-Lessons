package com.example.secondapp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile(){
        System.out.println("Compiling with 404 bugs faster");
    }
}
