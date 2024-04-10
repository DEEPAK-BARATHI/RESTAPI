package com.example.day2cw2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    @JsonProperty("Student Created")
    private String name;
    @JsonProperty("Age")
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}