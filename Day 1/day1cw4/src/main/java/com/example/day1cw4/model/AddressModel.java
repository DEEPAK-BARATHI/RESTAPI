package com.example.day1cw4.model;

public class AddressModel {
    private String name;
    private int doorNo;
    private String streetName;
    private int pincode;
    private String area;
    private String district;
    private String state;
    private String country;
    public AddressModel(String name, int doorNo, String streetName, int pincode, String area, String district,
            String state, String country) {
        this.name = name;
        this.doorNo = doorNo;
        this.streetName = streetName;
        this.pincode = pincode;
        this.area = area;
        this.district = district;
        this.state = state;
        this.country = country;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDoorNo() {
        return doorNo;
    }
    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }
    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    

}

