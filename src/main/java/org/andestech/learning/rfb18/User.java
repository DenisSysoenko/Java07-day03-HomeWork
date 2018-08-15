/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.andestech.learning.rfb18;

/**
 *
 * @author danil
 */
public class User {
    private int userID;
    private String firstName;
    private String secondName;
    private static int userCount = 0;
    
    User(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        userID = userCount;
        userCount++;
    }
    
    public int getUserID() {
        return userID;
    }
    
    public String getUserName() {
        return firstName + " " + secondName;
    }
}
