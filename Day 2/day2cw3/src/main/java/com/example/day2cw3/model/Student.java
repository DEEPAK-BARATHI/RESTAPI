package com.example.day2cw3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student {
    private long id;
    private String name;
    @JsonIgnore
    private String description;
    public Student(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}

