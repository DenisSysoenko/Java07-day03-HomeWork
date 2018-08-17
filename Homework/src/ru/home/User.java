package ru.home;

public class User {

    private String name;
    private String secondName;

    public User createUser(String name, String secondName){
        System.out.println("Пользователь" + " " + name + " " + secondName + " " + "создан");
        return new User();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
