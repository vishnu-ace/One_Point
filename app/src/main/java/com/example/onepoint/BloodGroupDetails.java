package com.example.onepoint;

public class BloodGroupDetails {

    String Age;
    String Phone;

    public BloodGroupDetails() {

    }



    @Override
    public String toString() {
        return "BloodGroupDetails{" +
                "Age='" + Age + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }

    public String getAge() {
        return Age;
    }

    public String getPhone() {
        return Phone;
    }

    public void setAge(String age) {
        Age = age;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
