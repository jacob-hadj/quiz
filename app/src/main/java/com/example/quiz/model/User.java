package com.example.quiz.model;

public class User {
    private String mFirstname;


    public User() {

    }

    public String getFirstname() {
        return mFirstname;
    }

    public void setFirstname(String Firstname) {
        this.mFirstname = Firstname;
    }

    @Override
    public String toString() {
        return "User{" +
                "mFirstname='" + mFirstname + '\'' +
                '}';
    }
}
