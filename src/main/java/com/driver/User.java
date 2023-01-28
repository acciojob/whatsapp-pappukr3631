package com.driver;

public class User {
    private String name;
    private String mobile;

    //My Code Below
    //Constructor
    public User(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }
    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
