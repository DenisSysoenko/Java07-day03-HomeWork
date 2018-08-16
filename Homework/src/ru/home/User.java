package ru.home;

public class User {

    public UserAccount createAccount() {
        System.out.println("Счет создан");
        return new UserAccount();
    }


}
