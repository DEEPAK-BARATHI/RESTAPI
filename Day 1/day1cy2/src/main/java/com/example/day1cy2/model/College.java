package com.example.day1cy2.model;

public class College {
    private String collegeName;
    private String departmentName;
    private int section;
    public College(String collegeName, String departmentName, int section) {
        this.collegeName = collegeName;
        this.departmentName = departmentName;
        this.section = section;
    }
    public String getCollegeName() {
        return collegeName;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public int getSection() {
        return section;
    }
    public void setSection(int section) {
        this.section = section;
    }
    
}
