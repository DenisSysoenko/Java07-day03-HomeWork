package org.andestech.learning.rfb18;

public class User {
    private int userID;
    private String firstName;
    private String lastName;
    private static int userCount = 0;


    User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        userID = userCount;
        userCount++;


    }

    public User() {
        return;
    }

    public int getUserID(){

        return userID;
}

public String getUserName(){
        return firstName + ' ' + lastName;
}

}
