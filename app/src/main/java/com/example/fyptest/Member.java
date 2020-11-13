package com.example.fyptest;

public class Member {
    private String Name;
    private Integer Age;
    private Long PhoneNo;
    private Float Height;

    public Member() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Long getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        PhoneNo = phoneNo;
    }

    public Float getHeight() {
        return Height;
    }

    public void setHeight(Float height) {
        Height = height;
    }
}
