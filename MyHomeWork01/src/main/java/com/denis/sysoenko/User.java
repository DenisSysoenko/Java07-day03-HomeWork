package com.denis.sysoenko;

public class User {

    private String FirstName;
    private String SecondName;


    public User(String firstName, String secondName) {
        FirstName = firstName;
        SecondName = secondName;
        System.out.println("---------------START------------------");
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + secondName);
    }


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }
}
