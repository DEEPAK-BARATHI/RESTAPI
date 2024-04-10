package com.example.day1cw5.model;


public class StudentModel {
    private int rollno;
    private String name;
    public StudentModel(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
        
    
}
