package org.andestech.learning.rfb18;

public class User {

    private String[] user={"","",""};

    public User(){

    }

    public User(String name, String surname){
        user[0]=name;
        user[1]=surname;
    }


    public void setUserAccount(String userAccount){
        user[2]=userAccount;
    }

    public String getUser() {
        return "name: " + user[0] + ", surname: " + user[1] + ", account: " + user[2];
    }

    public void setUserName(String name) {
        user[0] = name;
    }

    public void setUserSurname(String surname) {
        user[1] = surname;
    }
}
