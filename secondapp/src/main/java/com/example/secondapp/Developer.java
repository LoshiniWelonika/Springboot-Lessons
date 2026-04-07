package com.example.secondapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
public class Developer {

    @Autowired  //Field Injection
    @Qualifier("desktop")   //Specifies the exact class because there are two classes that implements same interface 
    private Computer comp;

    public void build(){
        comp.compile();
        System.out.println("Working on Awesome Project");
    }

}
