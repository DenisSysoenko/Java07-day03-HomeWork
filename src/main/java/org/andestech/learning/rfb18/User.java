package org.andestech.learning.rfb18;

public class User  {
    private String userName;
    private String userSurname;
    private int id;
    private static int globalId = 1;

    public static User createUser(String name, String surname){
        return new User(name, surname);
    }

    private User(){
        id = globalId++;
    }

    private User(String name, String surname){
        this();
        setUserName(name);
        setUserSurname(surname);
    }

    public String getUserName() {
        return userName;
    }

    private void setUserName(String name) {
        this.userName = name;
    }

    public String getUserSurname() {
        return userSurname;
    }

    private void setUserSurname(String surname) {
        this.userSurname = surname;
    }

    public int getId() {
        return id;
    }
}
