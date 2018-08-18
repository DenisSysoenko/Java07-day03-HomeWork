package org.andestech.learning.rfb18;


import java.util.UUID;

public class User {

    private String name;
    private String surname;
    private String numberAccount;

    public User(String name, String surname, String numberAccount) {
        this.name = name;
        this.surname = surname;
        this.numberAccount = numberAccount;


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }
}

