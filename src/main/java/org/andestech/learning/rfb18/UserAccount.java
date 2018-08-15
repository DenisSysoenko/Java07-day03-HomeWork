package org.andestech.learning.rfb18;

import java.sql.SQLOutput;

public class UserAccount implements IAccount {

    Integer totalAmount;

    @Override
    public void withdrawal() {
        System.out.println("No more money.");

    }

    @Override
    public String checkTransaction() {
        System.out.println("Transaction successful");

        return totalAmount.toString();
    }

    @Override
    public void put(Integer incomeAmount) {
        this.totalAmount = incomeAmount;
        System.out.println("+" + incomeAmount + "$");
    }

    @Override
    public String report() {
        System.out.println(totalAmount);
        return new String();
    }
}
