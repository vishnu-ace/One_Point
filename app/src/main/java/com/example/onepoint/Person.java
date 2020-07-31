package com.example.onepoint;

public class Person {

    private String name;
    private String phone_no;
    private String des;
    private String email;
    private int image;



    public Person(String name, String phone_no, String des, String email, int image) {
        this.name = name;
        this.phone_no = phone_no;
        this.des = des;
        this.email=email;
        this.image=image;
    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
